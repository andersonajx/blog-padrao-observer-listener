package br.com.andersonajx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VendaView extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Venda Com Estoque");
		stage.resizableProperty().setValue(false);

		BorderPane borderPane = new BorderPane();

		Label produtoLabel = new Label("Produto");
		Label quantidadeLabel = new Label("Quantidade");
		TextField produtoText = new TextField();
		TextField quantidadeText = new TextField();

		Button inserirButton = new Button("Inserir");

		VBox topo = new VBox();
		topo.setPadding(new Insets(12, 12, 12, 12));
		topo.setSpacing(10);
		topo.setStyle("-fx-background-color: silver;");
		topo.getChildren().addAll(produtoLabel, produtoText, quantidadeLabel, quantidadeText, inserirButton);

		TableView table = new TableView();
		table.setPrefWidth(500);

		TableColumn produtoColumn = new TableColumn("Produto");
		produtoColumn.setMinWidth(250);

		TableColumn quantidadeColumn = new TableColumn("Quantidade");
		quantidadeColumn.setMinWidth(250);

		table.getColumns().addAll(produtoColumn, quantidadeColumn);

		HBox centro = new HBox();
		centro.setPadding(new Insets(12, 12, 12, 12));
		centro.setSpacing(10);
		centro.setStyle("-fx-background-color: silver;");
		centro.getChildren().addAll(table);

		borderPane.setTop(topo);
		borderPane.setCenter(centro);

		Scene form = new Scene(borderPane, 500, 300);

		stage.setScene(form);
		stage.show();
	}
}
