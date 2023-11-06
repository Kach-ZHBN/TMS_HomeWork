package homework.homework13;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DocumentWriter {

    private final String filePath;

    public DocumentWriter(String filePath) {
        this.filePath = filePath;
    }

    /*
    Разделяю файл на строки. Сверяю каждую строку с шаблоном. Файлы-отчеты создаю в той же директории, где
    и находится проверяемый файл.
     */
    public void getReportFiles() throws IOException {
        Path path = Paths.get(filePath);
        String directory = path.getParent().toString();
        StringBuilder validDocumentNumbers = new StringBuilder();
        StringBuilder invalidDocumentNumbers = new StringBuilder();
        String validRegex = "(docnum[A-Za-zА-Яа-я0-9]{9}(\\n|\\z))|(contract[A-Za-zА-Яа-я0-9]{7}(\\n|\\Z))";


        FileWriter fileWriterFotValidNumbers = new FileWriter(directory + "\\Valid document numbers.txt");
        FileWriter fileWriterFotInvalidNumbers = new FileWriter(directory + "\\Invalid document numbers.txt");

        List<String> docNumbers = Files.readAllLines(path);
        for (String docNumber : docNumbers) {
            if (docNumber.matches(validRegex)) {
                validDocumentNumbers.append(docNumber).append("\n");
            } else {
                invalidDocumentNumbers.append(docNumber).append(" | ").append(getErrorReason(docNumber)).append("\n");
            }
        }

        fileWriterFotValidNumbers.write(validDocumentNumbers.toString());
        fileWriterFotValidNumbers.flush();

        fileWriterFotInvalidNumbers.write(invalidDocumentNumbers.toString());
        fileWriterFotInvalidNumbers.flush();

        fileWriterFotValidNumbers.close();
        fileWriterFotInvalidNumbers.close();
    }

    /*
    Метод, формирующий ошибку, которую добавляю в файл некорректных номеров документов.
     */
    private String getErrorReason(String inputString){
        StringBuilder stringBuilder = new StringBuilder();
        if(inputString.matches("(.*(\\W|_).*(\\n|\\z))")){ //поиск недопустимых символов
            stringBuilder.append("Недопустимые символы в строке. ");
        }
        if(inputString.length() != 15){
            stringBuilder.append("Длина строки не равна 15. ");
        }else{
            stringBuilder.append("Несоответствующий формат строки ");
        }
        return stringBuilder.toString();
    }

}
