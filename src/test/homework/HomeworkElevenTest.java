package homework;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeworkElevenTest {

    @Test
    public void testGetAbbreviations() {
        assertEquals(HomeworkEleven.getAbbreviations(""), new String[0]);
        assertEquals(HomeworkEleven.getAbbreviations("Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit."), new String[0]);
        assertEquals(HomeworkEleven.getAbbreviations("ASAP"), new String[]{"ASAP"});
        assertEquals(HomeworkEleven.getAbbreviations("Lorem ipsum dolor sit amet, " +
                "conKKsectetur ASAP adip JUIKOK isBTWcing elQWEWERTYit. ASAP"), new String[]{"ASAP", "JUIKOK", "ASAP"});
    }

    @Test
    public void testGetDocumentNumbers() {
        assertEquals(HomeworkEleven.getDocumentNumbers(""), new String[0]);
        assertEquals(HomeworkEleven.getDocumentNumbers("1234-1234-12"), new String[]{"1234-1234-12"});
        assertEquals(HomeworkEleven.getDocumentNumbers("Lore1234-9856-11m ipsum YE dolor " +
                "UYTJHG sit OFT amet, 1458-5698-41,consectetur D 1548-6589-12456 adipiscing JHFYUK  " +
                " ED154-5554-23HD ДЖАВА elit. 1548-9654-95?!"), new String[]{"1458-5698-41", "1548-9654-95"});
    }

    @Test
    public void testGetPhoneNumbers() {
        assertEquals(HomeworkEleven.getPhoneNumbers(""), new String[0]);
        assertEquals(HomeworkEleven.getPhoneNumbers("+(12)1234569"), new String[]{"+(12)1234569"});
        assertEquals(HomeworkEleven.getPhoneNumbers("Lorem ipsum + (45)1548954 dolor sit amet, consectetur adipiscing " +
                "elit. Morbi +(84)1914699 in ni +(47)8961254 sl leo."), new String[]{"+(84)1914699", "+(47)8961254"});
    }

    @Test
    public void testGetEmails() {
        assertEquals(HomeworkEleven.getEmails(""), new String[0]);
        assertEquals(HomeworkEleven.getEmails("kach.zhbn@gnail.com"), new String[]{"kach.zhbn@gnail.com"});
        assertEquals(HomeworkEleven.getEmails("Lorem ipsum teachmeskills@gmail.com teachmeskills@gmail,com" +
                "teachmeskills@gmailcom teachmeskillsgmail.com sit amet, consectetur adipiscing " +
                "elit. Morbi in nisl leo."), new String[]{"teachmeskills@gmail.com"});
    }

    @Test
    public void testAdditionalTaskOne() {
        assertEquals(HomeworkEleven.additionalTaskOne("<0>Java <4> Test </4> </0>\n" +
                        "0Hello <object0> World 0\n" +
                        "<1> Hello <object0> World</1> <object0>\n" +
                        "Before<100> object0\n" +
                        "<100> Before After</100>"),
                new String[][]{ new String[]{"<0>Java <4> Test </4> </0>", "0", "Java <4> Test </4> ", "0", null, null},
                                new String[]{"<object0>", null, null, null, null, "0"},
                                new String[]{"<1> Hello <object0> World</1>", "1", " Hello <object0> World", "1", null, null},
                                new String[]{"<object0>", null, null, null, null, "0"},
                                new String[]{"<100>", null, null, null, "100", null},
                                new String[]{"<100> Before After</100>", "100", " Before After", "100", null, null}
                });
        /*
        String[][] x = HomeworkEleven.additionalTaskOne("<0>Java <4> Test </4> </0>\n" +
                "0Hello <object0> World 0\n" +
                "<1> Hello <object0> World</1> <object0>\n" +
                "Before<100> object0\n" +
                "<100> Before After</100>");
        for(int i =0; i < x.length; i++){
            System.out.println(Arrays.toString(x[i]));
        }
         */
    }

    @Test
    public void testAdditionalTaskTwo() {
        assertEquals(HomeworkEleven.additionalTaskTwo("<0>Java <4> Test </4> After </0>\n" +
                        "<0>Before Test After </0>\n" +
                        "Before Test After\n" +
                        "Hello <object> World\n" +
                        "<1> Hello World </1>   test <object>"),
                new String[][]{ new String[]{"<0>Java ", null, null},
                                new String[]{"<4> Test </4>", "<4> Test </4>", null},
                                new String[]{" After </0>", null, null},
                                new String[]{"<0>Before Test After </0>", "<0>Before Test After </0>", null},
                                new String[]{"Before Test After", null, null},
                                new String[]{"Hello ", null, null},
                                new String[]{"<object>", null, "<object>"},
                                new String[]{" World", null, null},
                                new String[]{"<1> Hello World </1>", "<1> Hello World </1>", null},
                                new String[]{"   test ", null, null},
                                new String[]{"<object>", null, "<object>"}
                });
        /*
        String[][] x = HomeworkEleven.additionalTaskTwo("<0>Java <4> Test </4> After </0>\n" +
                "<0>Before Test After </0>\n" +
                "Before Test After\n" +
                "Hello <object> World\n" +
                "<1> Hello World </1>   test <object>");
        for(int i =0; i < x.length; i++){
            System.out.println(Arrays.toString(x[i]));
        }
         */
    }
}