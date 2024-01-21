package homework.homework32.frontController;

import homework.homework32.frontController.view.HomeView;
import homework.homework32.frontController.view.ItemView;
import homework.homework32.frontController.view.ErrorView;

public class Dispatcher {
    private HomeView homeView;
    private ItemView itemView;
    private ErrorView errorView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.itemView = new ItemView();
        this.errorView = new ErrorView();
    }

    public void dispatch(String request){
        if(request.equals("HOME")){
            homeView.show();
        } else if (request.equals("ITEM")) {
            itemView.show();
        }else{
            errorView.show();
        }
    }
}
