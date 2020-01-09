import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.Pane; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javafx.scene.shape.*;
import javafx.scene.text.*; import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.scene.input.MouseEvent;
import javafx.scene.Cursor;
import javafx.scene.effect.DropShadow;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import java.io.InputStream;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.animation.FadeTransition;  
import javafx.animation.SequentialTransition;  
import javafx.animation.ParallelTransition;
import java.util.ArrayList;
import javafx.application.Platform;
 
 
public class VacHeap extends Application{

	int guide = 0;
	Pane pane = new Pane(); int studCount = 0, ageValue=0;
	Button add, vaccinate, next, none;
    TextField ageField; Text ageWarning, noStudents; 
    Text treeText[] = new Text[8]; Circle round[] = new Circle[8];	ImageView tails[] = new ImageView[8];
    Text ageText[] = new Text[8];  
    int XX[] = {0, 0, 70, -70, 45, -30, 40, -35};
    
    ImageView student[], tt; ArrayList<Integer> numGuide = new ArrayList<Integer>(); int copy[] = new int[studCount];
    ImageView studenta, studentb, studentc, studentd, studente, studentf, studentg, tail2,tail3,tail4,tail5,tail6,tail7;
    TranslateTransition toWalk1 = new TranslateTransition(Duration.seconds(4));		TranslateTransition toWalk2 = new TranslateTransition(Duration.seconds(4));
    TranslateTransition toWalk3 = new TranslateTransition(Duration.seconds(4));		TranslateTransition toWalk4 = new TranslateTransition(Duration.seconds(3));TranslateTransition toWalk5 = new TranslateTransition(Duration.seconds(3));TranslateTransition toWalk6 = new TranslateTransition(Duration.seconds(2));TranslateTransition toWalk7 = new TranslateTransition(Duration.seconds(2));
    TranslateTransition roomOut = new TranslateTransition(Duration.seconds(6));		TranslateTransition roomIn = new TranslateTransition(Duration.seconds(3));
    TranslateTransition roomOut2 = new TranslateTransition(Duration.seconds(.5));
    TranslateTransition roundSwap1 = new TranslateTransition(Duration.seconds(1));	TranslateTransition roundSwap2 = new TranslateTransition(Duration.seconds(1));
    TranslateTransition roundSwap3 = new TranslateTransition(Duration.seconds(1));	TranslateTransition roundSwap4 = new TranslateTransition(Duration.seconds(1));
    TranslateTransition toWalks[] = new TranslateTransition[8];
    ScaleTransition treePop = new ScaleTransition(Duration.seconds(.5)); ScaleTransition roundPop = new ScaleTransition(Duration.seconds(.5));
    ParallelTransition pt = new ParallelTransition(treePop, roundPop);ScaleTransition forTT = new ScaleTransition(Duration.seconds(1)); 
    Service studentExit = new exit();Service flip = new flipBack(); Service afterExit = new sixSec(); Service treeWait = new threeSec();Service swapWait = new twoSec();Service pointFive = new oneSec();Service vaccinateSwapWait1 = new twoSec();Service vaccinateSwapWait2 = new twoSec();	
    HeapClass heap = new HeapClass();
	
	
  	Text   textt   = new Text("");Circle circle = encircle(textt);
    Text   textt1   = new Text("");Circle circle1 = encircle(textt1);
    Text   textt2   = new Text("");Circle circle2 = encircle(textt2);
    Text   textt3   = new Text("");Circle circle3 = encircle(textt3);
    Text   textt4   = new Text("");Circle circle4 = encircle(textt4);
    Text   textt5   = new Text("");Circle circle5 = encircle(textt5);
    Text   textt6   = new Text("");Circle circle6 = encircle(textt6);
	
	Text   age1    = new Text("");
    Text   age2    = new Text("");
    Text   age3    = new Text("");
    Text   age4    = new Text("");
    Text   age5    = new Text("");
    Text   age6    = new Text("");
    Text   age7    = new Text("");
     @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
    	student = new ImageView[8]; 
    	Image bgg = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\bg2.png"));
    	ImageView bggg = new ImageView(bgg); 
    	pane.getChildren().add(bggg);
    	Image bggdoor = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\bgdoor2.png"));
    	ImageView door = new ImageView(bggdoor); 
    	Image t1 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\injection.png"));
		tt = new ImageView(t1);	
		Image tt2 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr2.png"));
		Image tt3 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr3.png"));
		Image tt4 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr4.png"));	
		Image tt5 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr5.png"));
		Image tt6 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr6.png"));
		Image tt7 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\tr7.png"));
    	Image std1 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human2.png"));
    	Image std2 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human1.png"));
    	Image std3 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human3.png"));
    	Image std4 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human4.png"));
    	Image std5 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human5.png"));
    	Image std6 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human6.png"));
    	Image std7 = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\human7.png"));
    	Image vac = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\btnVaccinate.png"));
		Image neww = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\btnNew.png"));
		Image rstart = new Image(new FileInputStream("\\Users\\win10\\Documents\\JCreator Pro\\MyProjects\\VacHeap\\Files\\btnRestart.png"));

    	
		ImageView btnVac = new ImageView(vac);
		ImageView btnNew = new ImageView(neww);
		add = new Button("ADD", new ImageView(neww));
   		vaccinate = new Button("VACCINATE", new ImageView(vac));
   		ageField = new TextField();
   		ageWarning = new Text("Please Enter Age!");	
   		noStudents = new Text("There's no student!");
   		next = new Button("", new ImageView(rstart));
   		none = new Button("NONE");
        addNew();
        

        
    	studenta = new ImageView(std1);		tail2 = new ImageView(tt2);
    	studentb = new ImageView(std2);		tail3 = new ImageView(tt3);		
    	studentc = new ImageView(std7);		tail4 = new ImageView(tt4);
    	studentd = new ImageView(std4);		tail5 = new ImageView(tt5);
    	studente = new ImageView(std6);		tail6 = new ImageView(tt6);
    	studentf = new ImageView(std5);		tail7 = new ImageView(tt7);
    	studentg = new ImageView(std3);		
		students(); textProperties();
		
		
		

		
	
		numGuide.add(9);
		student[1] = studenta;		treeText[1] = textt;		round[1] = circle; 	toWalks[1] = toWalk1;		tails[2] = tail2;	
		student[2] = studentb;		treeText[2] = textt1;		round[2] = circle1;	toWalks[2] = toWalk2;		tails[3] = tail3;
		student[3] = studentc;		treeText[3] = textt2;		round[3] = circle2;	toWalks[3] = toWalk3;		tails[4] = tail4;
		student[4] = studentd;		treeText[4] = textt3;		round[4] = circle3;	toWalks[4] = toWalk4;		tails[5] = tail5;
		student[5] = studente;		treeText[5] = textt4;		round[5] = circle4;	toWalks[5] = toWalk5;		tails[6] = tail6;
		student[6] = studentf;		treeText[6] = textt5;		round[6] = circle5;	toWalks[6] = toWalk6;		tails[7] = tail7;
		student[7] = studentg;		treeText[7] = textt6;		round[7] = circle6;	toWalks[7] = toWalk7;
	
		
		ageText[1] = age1;
		ageText[2] = age2;
		ageText[3] = age3;
		ageText[4] = age4;
		ageText[5] = age5;
		ageText[6] = age6;
		ageText[7] = age7;
		
		
		
		
			
			
			
		
		pane.getChildren().add(door);
        Scene scene = new Scene(pane, 990, 590);
                
        primaryStage.setTitle("Vaccination Heap Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        
        

         	
        	//ADD BUTTON
       		add.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
            if(ageField.getText().equals("")||studCount==7){
       				ageWarning.setVisible(true);
       			}else{		
            studCount++;
            ageWarning.setVisible(false);	
            System.out.println("\nstudCount " + studCount);
            ageValue = Integer.parseInt(ageField.getText().trim());
            
            numGuide.add(studCount, ageValue); heap.insert(ageValue);
            toWaitArea(); pop(); ageNumbers();            
            copy = heap.clone(); 
            
               

            	if(!treeWait.isRunning())
               	treeWait.restart();
                ageField.setText("");
                ageField.setPromptText("Age");
                
                if(studCount>1){
       				vaccinate.setDisable(true);
       				add.setDisable(true);}
       			}
       			
            }});
            
            
            //VACCINATE BUTTON
            vaccinate.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
            	System.out.println();
            	if(studCount==0){
            		noStudents.setVisible(true);
            	}else{
            		
            	if(Integer.parseInt(treeText[1].getText())==copy[1]){	
            		noStudents.setVisible(false);
				vaccinate.setDisable(true);
				add.setDisable(true);
            	for(int i = 1; i<=studCount; i++){
            		if(numGuide.get(i)==copy[1]){
            			guide = i;
            			break;
            		}}
            	System.out.println("\nguide: " + guide);	
            	
            	heap.heapArray();
            	heap.remove();
            	copy = heap.clone(); 
            	numGuide.remove(guide);
            	System.out.println("\nnumGuideSize: " + numGuide.size());
            	int j = 700;
 			for(int i = 1; i <= 7; i++){
                if(i==guide){
                roomIn.setByX(950-j);
                roomIn.setNode(student[guide]);
                roomIn.play();
 				System.out.println("\nJ: " + j);	
                }
                
 				j=j-90;
 			}
 			
 			
 			
 			
 				treePop.setByX(0.2f);						roundPop.setByX(0.2f);
    			treePop.setByY(0.2f);						roundPop.setByY(0.2f);
     			treePop.setCycleCount(2);					roundPop.setCycleCount(2);
     			treePop.setAutoReverse(true);				roundPop.setAutoReverse(true);
 				treePop.setNode(treeText[studCount]);		roundPop.setNode(round[studCount]);
     			pt.play();
     			
     			
     			if(!pointFive.isRunning())
                pointFive.restart(); 
                if(!studentExit.isRunning())
                studentExit.restart();
                if(!flip.isRunning())
                flip.restart();
                if(!afterExit.isRunning())
                afterExit.restart();	}}} });	
            
            	 	
            next.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
            	VacHeap vh = new VacHeap();
            	try{
            	vh.start(primaryStage);
            	}catch(Exception e){	}
            }}); none.setVisible(false); 
            	
            	//-----------------SERVICES---------------------------------
            	
            	
            	
            	
            	
            	studentExit.setOnSucceeded(e -> {
            	student[guide].setVisible(false);
            	ageText[guide].setVisible(false);
            	vaccinate.setDisable(false);
            	add.setDisable(false);
            	tt.setVisible(false);    
            	roomOut2.setByX(-950);
                roomOut2.setNode(student[guide]);
                roomOut2.play();      	      
            	});
            		 	

            	
            		 	
            	flip.setOnSucceeded(e -> {
            	tt.setVisible(true);      
            	forTT.setByX(0.2f);					
    			forTT.setByY(0.2f);					
     			forTT.setCycleCount(2);				
     			forTT.setAutoReverse(true);			
 				forTT.setNode(tt);	
 				forTT.play();										
            	});	
            		
            		           		
            		

            	afterExit.setOnSucceeded(e -> {
            	studCount--;
            	ImageView temp = student[guide];
            	Text temp1 = ageText[guide];
            	for(int i = guide; i <= 6; i++){
            		student[i] = student[i+1];
            		ageText[i] = ageText[i+1];
            	} student[7] = temp;ageText[7] = temp1;
            	  	
            	for(int i = guide; i<=studCount; i++){
            	System.out.println("\nnextguide" + i);
            	System.out.println(student[i]);
            	student[i].setX(student[i].getX()+90);
            	ageText[i].setX(ageText[i].getX()+90); }});	
            	
            	
            	   	
            	
            	
            	treeWait.setOnSucceeded(e -> {
            	System.out.println("\nSwap Number: " + heap.getSwapNum());
            	int s = heap.getSwapNum();
            	int xx = 0, yy = 0;
                if(studCount==5||studCount==7||studCount==3){
                	int temp = XX[studCount];
                	xx = temp-temp-temp;
                }else{
                	xx = -XX[studCount];
                  }	
                	    if(s<1){
                	    	vaccinate.setDisable(false);
                	    	add.setDisable(false);} 
                	    if(s==1){
                	    	vaccinate.setDisable(false);                	    	
                	    	add.setDisable(false);}  	
            	if(s>=1){					
            		roundSwap1.setByX(XX[studCount]);			roundSwap2.setByX(xx);
            		roundSwap1.setByY(-75);						roundSwap2.setByY(75);
            		roundSwap1.setNode(round[studCount]);		roundSwap2.setNode(round[studCount/2]);
            		roundSwap1.play();							roundSwap2.play();
            		
					roundSwap3.setByX(XX[studCount]);			roundSwap4.setByX(xx);
            		roundSwap3.setByY(-75);						roundSwap4.setByY(75);
            		roundSwap3.setNode(treeText[studCount]);	roundSwap4.setNode(treeText[studCount/2]);
            		roundSwap3.play();							roundSwap4.play();
            			
            		Circle temp = round[studCount];				Text tmp = treeText[studCount];
            		round[studCount] = round[studCount/2];		treeText[studCount] = treeText[studCount/2];
            		round[studCount/2] = temp;					treeText[studCount/2] = tmp; 	        					}
            	if(s==2){
            		System.out.println("\nread");
            		if(!swapWait.isRunning())
                	swapWait.restart();  		}});	
       						   		
       				swapWait.setOnSucceeded(e -> {
       				int current = studCount/2;
       				int xx = 70;
       				int xxx = -70;
       				if(current==2){
       					xx = -70;
       					xxx = 70;
      					}
      					vaccinate.setDisable(false);
      				   	add.setDisable(false);
            		roundSwap1.setByX(xxx);						roundSwap2.setByX(xx);
            		roundSwap1.setByY(-75);						roundSwap2.setByY(75);
            		roundSwap1.setNode(round[studCount/2]);		roundSwap2.setNode(round[1]);
            		roundSwap1.play();							roundSwap2.play();
            		
            		roundSwap3.setByX(xxx);						roundSwap4.setByX(xx);
            		roundSwap3.setByY(-75);						roundSwap4.setByY(75);
            		roundSwap3.setNode(treeText[studCount/2]);	roundSwap4.setNode(treeText[1]);
            		roundSwap3.play();							roundSwap4.play();
            			
            		Circle temp = round[studCount/2];			Text tmp = treeText[studCount/2];
            		round[studCount/2] = round[1];				treeText[studCount/2] = treeText[1];
            		round[1] = temp;							treeText[1] = tmp;	     	});
            		

            	pointFive.setOnSucceeded(e -> {
            	round[studCount].setVisible(false);
            	treeText[studCount].setVisible(false);  
            	System.out.println("\n read studcount: " + studCount);
            	if(studCount>1){
     			tails[studCount].setVisible(false);}
     				String toCen = treeText[studCount].getText(); 					
 					treeText[1].setText(toCen);
				   treeText[1].setX(treeText[1].getLayoutX()-treeText[1].getLayoutX());
     			   treeText[1].setX(treeText[1].getX() - treeText[1].getLayoutBounds().getWidth()/2);


     			if(!vaccinateSwapWait1.isRunning())
                	vaccinateSwapWait1.restart();	       
            	});	
            		
            	vaccinateSwapWait1.setOnSucceeded(e -> {
   					System.out.println("\nminChild: " + heap.getMinChild());
   					System.out.println("\nparent: " + heap.getParent());
   					System.out.println("\ncount: " + heap.getCount());
            	    int current = heap.getMinChild();
            	    if(heap.getCount()!=1)current=heap.getParent();
       				int xx = 70;
       				int xxx = -70;
       				if(current==2){
       					xx = -70;
       					xxx = 70;}
       				if(heap.getCount()>=1){	
       				
            		roundSwap1.setByX(xxx);							roundSwap2.setByX(xx);
            		roundSwap1.setByY(-75);							roundSwap2.setByY(75);
            		roundSwap1.setNode(round[current]);				roundSwap2.setNode(round[1]);
            		roundSwap1.play();								roundSwap2.play();

            		roundSwap3.setByX(xxx);							roundSwap4.setByX(xx);
            		roundSwap3.setByY(-75);							roundSwap4.setByY(75);
            		roundSwap3.setNode(treeText[current]);			roundSwap4.setNode(treeText[1]);
            		roundSwap3.play();								roundSwap4.play();
		           		
            		Circle temp = round[current];					Text tmp = treeText[current];
            		round[current] = round[1];						treeText[current] = treeText[1];
            		round[1] = temp;								treeText[1] = tmp; }
            		
            		if(heap.getCount()==2){
            		if(!vaccinateSwapWait2.isRunning())
                	vaccinateSwapWait2.restart();	
            		}});
            		
            		
            		
            		
            		vaccinateSwapWait2.setOnSucceeded(e -> {
            		int child = heap.getMinChild();	
            		int parent = heap.getParent();
            		int xx = 0, yy = 0;
                if(child==5||child==7||child==3){
                	int temp = XX[child];
                	xx = temp-temp-temp;
                }else{
                	xx = -XX[child];
                  }	
                	      						
            		roundSwap1.setByX(XX[child]);					roundSwap2.setByX(xx);
            		roundSwap1.setByY(-75);							roundSwap2.setByY(75);
            		roundSwap1.setNode(round[child]);				roundSwap2.setNode(round[parent]);
            		roundSwap1.play();								roundSwap2.play();
	
            		roundSwap3.setByX(XX[child]);					roundSwap4.setByX(xx);
            		roundSwap3.setByY(-75);							roundSwap4.setByY(75);
            		roundSwap3.setNode(treeText[child]);			roundSwap4.setNode(treeText[parent]);
            		roundSwap3.play();								roundSwap4.play();
            				
            		Circle temp = round[child];						Text tmp = treeText[child];
            		round[child] = round[parent];					treeText[child] = treeText[parent];
            		round[parent] = temp;	 						treeText[parent] = tmp;	});
            			
    }
    
    
    
    
		//-----------------METHODS---------------------------------

		
		public void toWaitArea(){
 			int j = 700;
 			for(int i = 1; i <= 7; i++){
 				if(i==studCount){
 					student[studCount].setVisible(true);
 					toWalks[i].setByX(j);
 					toWalks[i].setNode(student[studCount]);
 					toWalks[i].play();	
 				}
 				j=j-90;
 			}}
 			
 		public void ageNumbers(){
 			for(int i = 1; i<=studCount; i++){
            	System.out.print(numGuide.get(i) + " ");
				ageText[studCount].setX(10.0f);
				ageText[studCount].setY(50.0f);
				ageText[studCount].setCache(true);
				ageText[studCount].setFill(Color.OLIVEDRAB);
				ageText[studCount].setFont(Font.font("Century Gothic", FontWeight.BOLD, 30));
           		ageText[studCount].setStroke(Color.WHITE);
           		ageText[studCount].setStrokeWidth(2);
			            	            
            	ageText[studCount].setText(""+numGuide.get(i));
      		    ageText[studCount].setVisible(true);
      		    ageText[1].setX(645); 
      		    ageText[1].setY(500);
      		    ageText[2].setX(550); 
      		    ageText[2].setY(500);
      		    ageText[3].setX(460); 
      		    ageText[3].setY(500);
      		    ageText[4].setX(373); 
      		    ageText[4].setY(500);
      		    ageText[5].setX(285);
      		    ageText[5].setY(500);
      		    ageText[6].setX(195); 
      		    ageText[6].setY(500);
      		    ageText[7].setX(105); 
      		    ageText[7].setY(500);    	
            }
 		}	
 			
 		

 		public void pop(){
 			String toCen = numGuide.get(studCount).toString();
 			treeText[studCount].setText(toCen);
 			treeText[studCount].setX(treeText[studCount].getLayoutX()-treeText[studCount].getLayoutX());
 			treeText[studCount].setX(treeText[studCount].getX() - treeText[studCount].getLayoutBounds().getWidth()/2);

 			
        	treeText[studCount].setVisible(true);	round[studCount].setVisible(true);	
 			treePop.setByX(0.2f);					roundPop.setByX(0.2f);
    		treePop.setByY(0.2f);					roundPop.setByY(0.2f);
     		treePop.setCycleCount(2);				roundPop.setCycleCount(2);
     		treePop.setAutoReverse(true);			roundPop.setAutoReverse(true);
 			treePop.setNode(treeText[studCount]);	roundPop.setNode(round[studCount]);
 															
     		pt.play();										
			if(studCount>1)
     		tails[studCount].setVisible(true);			     		}
 		
 		
    	public void students(){
    	studenta.setLayoutX(-90);  	studentb.setLayoutX(-90);	studentc.setLayoutX(-90);	studentd.setLayoutX(-90);
    	studenta.setLayoutY(270);	studentb.setLayoutY(270);	studentc.setLayoutY(270);	studentd.setLayoutY(270);
		studenta.setVisible(false);	studentb.setVisible(false);	studentc.setVisible(false); studentd.setVisible(false); 	 
      	
    	studente.setLayoutX(-90);	studentf.setLayoutX(-90);	studentg.setLayoutX(-90);	tt.setLayoutX(900);		
    	studente.setLayoutY(270);	studentf.setLayoutY(270);	studentg.setLayoutY(270);	tt.setLayoutY(280);
		studente.setVisible(false); studentf.setVisible(false); studentg.setVisible(false); tt.setVisible(false);
    	

    	pane.getChildren().add(studenta);
    	pane.getChildren().add(studentb);
    	pane.getChildren().add(studentc);
    	pane.getChildren().add(studentd); 	
    	pane.getChildren().add(studente);
    	pane.getChildren().add(studentf);
    	pane.getChildren().add(studentg);
    	pane.getChildren().add(tt);
    	}
    	
    	public void addNew(){	
 		ageWarning.setLayoutX(180);							ageField.setPrefWidth(50);
 		ageWarning.setLayoutY(540);							ageField.setPrefHeight(40);
 		ageWarning.setStyle("-fx-text-fill: #ff0a3b; ");	ageField.setLayoutX(145);	
 		ageWarning.setVisible(false); 						ageField.setLayoutY(540);
 		pane.getChildren().addAll(ageWarning);				ageField.setPromptText("Age");
 															pane.getChildren().addAll(ageField);
 				
 		add.setPrefWidth(100);								vaccinate.setPrefWidth(130);
    	add.setPrefHeight(40); 								vaccinate.setPrefHeight(40);
    	add.setLayoutX(40);									vaccinate.setLayoutX(230);
    	add.setLayoutY(540);								vaccinate.setLayoutY(540); 
    	add.setStyle("-fx-background-color: #fbfcdc; ");	vaccinate.setStyle("-fx-background-color: #fbfcdc; ");
    	add.setCursor(Cursor.OPEN_HAND);					vaccinate.setCursor(Cursor.OPEN_HAND); 	
    	pane.getChildren().addAll(add);						pane.getChildren().addAll(vaccinate);
    		
    	next.setPrefWidth(50);								noStudents.setLayoutX(480);
    	next.setPrefHeight(40); 							noStudents.setLayoutY(540);
    	next.setLayoutX(910);								noStudents.setStyle("-fx-text-fill: #ff0a3b; ");
    	next.setLayoutY(540); 								noStudents.setVisible(false); 
    	next.setStyle("-fx-background-color: #fbfcdc; ");	pane.getChildren().addAll(noStudents);
    	next.setCursor(Cursor.OPEN_HAND); 	
    	pane.getChildren().addAll(next);		
 			
 		none.setPrefWidth(100);
    	none.setPrefHeight(40); 
    	none.setLayoutX(700);	
    	none.setLayoutY(540); 
    	none.setStyle("-fx-background-color: #fbfcdc; ");
    	none.setCursor(Cursor.OPEN_HAND); 	
    	pane.getChildren().addAll(none);
 	}
 	
 		
 		
 		public void textProperties(){		
 		circle.setLayoutX(180);		circle1.setLayoutX(110);	circle2.setLayoutX(245);	circle6.setLayoutX(280);
        circle.setLayoutY(95);		circle1.setLayoutY(170);	circle2.setLayoutY(170);	circle6.setLayoutY(245);
        circle.setVisible(false);	circle1.setVisible(false);	circle2.setVisible(false);	circle6.setVisible(false);
        
        circle3.setLayoutX(65);		circle4.setLayoutX(140);	circle5.setLayoutX(205);
        circle3.setLayoutY(245);	circle4.setLayoutY(245);	circle5.setLayoutY(245);
        circle3.setVisible(false);	circle4.setVisible(false);	circle5.setVisible(false);
  
        textt.setLayoutX(180);
        textt.setLayoutY(95);
        textt.setVisible(false);
        textt.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt.setY(textt.getY() + textt.getLayoutBounds().getHeight()/2);
             
        
        textt1.setLayoutX(110);
        textt1.setLayoutY(170);
        textt1.setVisible(false);
        textt1.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt1.setLayoutY(textt1.getLayoutY() + textt1.getLayoutBounds().getHeight()/2);
        
        textt2.setLayoutX(245);
        textt2.setLayoutY(170);
        textt2.setVisible(false);
        textt2.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt2.setY(textt2.getY() + textt2.getLayoutBounds().getHeight()/2);
        
        textt3.setLayoutX(65);
        textt3.setLayoutY(245);
        textt3.setVisible(false);
        textt3.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt3.setY(textt3.getY() + textt3.getLayoutBounds().getHeight()/2);
        
        textt4.setLayoutX(140);
        textt4.setLayoutY(245);
        textt4.setVisible(false);
        textt4.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt4.setY(textt4.getY() + textt4.getLayoutBounds().getHeight()/2);
        
   
        textt5.setLayoutX(205);
        textt5.setLayoutY(245);
        textt5.setVisible(false);
        textt5.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt5.setY(textt5.getY() + textt5.getLayoutBounds().getHeight()/2);
        
        
        
        textt6.setLayoutX(280);
        textt6.setLayoutY(245);
        textt6.setVisible(false);
        textt6.setStyle("-fx-font-family: \"Century Gothic\";"  +"-fx-font-size: 20px;");
        textt6.setY(textt6.getY() + textt6.getLayoutBounds().getHeight()/2);
        

        pane.getChildren().add(tail2);pane.getChildren().add(tail4);pane.getChildren().add(tail6);
        pane.getChildren().add(tail3);pane.getChildren().add(tail5);pane.getChildren().add(tail7);
        pane.getChildren().addAll(circle,textt);				tail2.setVisible(false);
        pane.getChildren().addAll(circle1,textt1);				tail3.setVisible(false);		
        pane.getChildren().addAll(circle2,textt2);				tail4.setVisible(false);
        pane.getChildren().addAll(circle3,textt3);				tail5.setVisible(false);
        pane.getChildren().addAll(circle4,textt4);				tail6.setVisible(false);
        pane.getChildren().addAll(circle5,textt5);				tail7.setVisible(false);
        pane.getChildren().addAll(circle6,textt6);
        pane.getChildren().addAll(age1);
        pane.getChildren().addAll(age2);
        pane.getChildren().addAll(age3);
        pane.getChildren().addAll(age4);
        pane.getChildren().addAll(age5);
        pane.getChildren().addAll(age6);
        pane.getChildren().addAll(age7);
 		}
 		
 		
 		
 		private Circle encircle(Text textt) {
        Circle circle = new Circle();
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BURLYWOOD);
        final double PADDING = 30;
        circle.setRadius(PADDING);

        return circle;
    }
 		
 	
    	
    public static void main(String[] args) {
    	launch(args);
    	
    }
}
