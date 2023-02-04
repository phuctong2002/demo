package hust.main;


import hust.crawler.Crawler;
import hust.crawler.person.PersonNKS;
import hust.crawler.person.PersonWiki;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("home_v2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        Crawler obj = new EventNguoiKeSu();
//        obj.get();
//        Crawler obj = new PersonWiki();
//        obj.get();
        Crawler obj = new PersonNKS();
        obj.get();
        launch();
    }
}