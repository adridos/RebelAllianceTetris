
package grizzBlocks;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class Controller implements Initializable{
	
	// Getting the numbers and the MESH from Tetris
	public static final int MOVE = Tetris.MOVE;
	public static final int SIZE = Tetris.SIZE;
	public static int XMAX = Tetris.XMAX;
	public static int YMAX = Tetris.YMAX;
	public static int[][] MESH = Tetris.MESH;
	
	
	
	//home page
	 public Stage stage;
	 public Scene scene;
	 public Parent root;
	 @FXML
	    public Button btn_home;

	    @FXML
	    public Label greeting;

	    @FXML
	    public void switchToScene1(ActionEvent event) throws IOException {
	    	 // root = 
	    	  root = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
	    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	  scene = new Scene(root);
	          stage.setScene(scene);
	    	  stage.show(); 
	    	
			   //btn_home.setOnAction(e -> );

	    	 }
	
	  /*  public void setStage(Stage stage) {
	        this.stage = stage;
	        btn_home.setOnAction(event -> {
	           // commitToDatabase();
	            stage.hide();
	        });
	    }
	*/
	    
	    
	    
	    
	    
	    
	
	    private Stage myStage;
	    public void setStage(Stage stage) {
	         myStage = stage;
	    }
	

	public static void MoveRight(Form form) {
		if (form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE
				&& form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE) {
			int movea = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
			int moveb = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
			int movec = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
			int moved = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];
			if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
				form.a.setX(form.a.getX() + MOVE);
				form.b.setX(form.b.getX() + MOVE);
				form.c.setX(form.c.getX() + MOVE);
				form.d.setX(form.d.getX() + MOVE);
			}
		}
	}

	public static void MoveLeft(Form form) {
		if (form.a.getX() - MOVE >= 0 && form.b.getX() - MOVE >= 0 && form.c.getX() - MOVE >= 0
				&& form.d.getX() - MOVE >= 0) {
			int movea = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
			int moveb = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
			int movec = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
			int moved = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];
			if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
				form.a.setX(form.a.getX() - MOVE);
				form.b.setX(form.b.getX() - MOVE);
				form.c.setX(form.c.getX() - MOVE);
				form.d.setX(form.d.getX() - MOVE);
			}
		}
	}

	public static Form makeRect() {
		int block = (int) (Math.random() * 100);
		String name;
		Rectangle a = new Rectangle(SIZE-1, SIZE-1), b = new Rectangle(SIZE-1, SIZE-1), c = new Rectangle(SIZE-1, SIZE-1),
				d = new Rectangle(SIZE-1, SIZE-1);
		if (block < 15) { 
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "j";
		} else if (block < 30) { 
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2 - SIZE);
			b.setY(SIZE);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			d.setY(SIZE);
			name = "l";
		} else if (block < 45) { 
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2);
			c.setX(XMAX / 2 - SIZE);
			c.setY(SIZE);
			d.setX(XMAX / 2);
			d.setY(SIZE);
			name = "o";
		} else if (block < 60) { 
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 - SIZE);
			d.setY(SIZE);
			name = "s";
		} else if (block < 75) { 
			a.setX(XMAX / 2 - SIZE);
			b.setX(XMAX / 2);
			c.setX(XMAX / 2);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE);
			name = "t";
		} else if (block < 90) { 
			a.setX(XMAX / 2 + SIZE);
			b.setX(XMAX / 2);
			c.setX(XMAX / 2 + SIZE);
			c.setY(SIZE);
			d.setX(XMAX / 2 + SIZE + SIZE);
			d.setY(SIZE);
			name = "z";
		} else { 
			a.setX(XMAX / 2 - SIZE - SIZE);
			b.setX(XMAX / 2 - SIZE);
			c.setX(XMAX / 2);
			d.setX(XMAX / 2 + SIZE);
			name = "i";
		}
		return new Form(a, b, c, d, name);
	}







	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
