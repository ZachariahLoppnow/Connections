/*
 *	Author:  Zachariah Loppnow
 *  Date: 5/15/24
*/
package pkg;
import java.util.*;

public class Word{

    String[][] words =
    {{"Rain", "Sun", "Cloud", "Wind"},
    {"Mercury", "Venus", "Earth", "Mars"},
    {"Stem", "Leaf", "Root", "Flower"},
    {"Guitar", "Piano", "Violin", "Drum"},
    {"Spring", "Summer", "Autumn/Fall", "Winter"},
    {"Oxygen", "Hydrogen", "Carbon", "Nitrogen"},
    {"Monday", "Tuesday", "Wednesday", "Thursday"},
    {"Red", "Blue", "Yellow", "Green"},
    {"Wheel", "Engine", "Door", "Window"},
    {"Rose", "Tulip", "Daisy", "Lily"}};
   
    String[][] words2 = {
    {"Red", "Blue", "Yellow", "Green"},
    {"Lion", "Elephant", "Giraffe", "Zebra"},
    {"Apple", "Banana", "Orange", "Mango"},
    {"Pesto", "Marinara", "Rosé", "Alfredo"},
    {"Guitar", "Piano", "Violin", "Drum"},
    {"Rain", "Snow", "Wind", "Sunshine"},
    {"Doctor", "Teacher", "Engineer", "Artist"},
    {"Arm", "Leg", "Head", "Heart"},
    {"Soccer", "Basketball", "Tennis", "Swimming"},
    {"USA", "Japan", "Brazil", "Australia"}};
   
    String[][] words3 = {
    {"Sun", "Moon", "Star", "Galaxy"},
    {"Dog", "Cat", "Bird", "Fish"},
    {"Strawberry", "Watermelon", "Grapes", "Pineapple"},
    {"Mercury", "Venus", "Neptune", "Uranus"},
    {"Trumpet", "Flute", "Saxophone", "Clarinet"},
    {"Tornado", "Fog", "Hail", "Rainbow"},
    {"Lawyer", "Chef", "Pilot", "Firefighter"},
    {"Hand", "Foot", "Ear", "Eye"},
    {"Golf", "Rugby", "Boxing", "Hockey"},
    {"Germany", "France", "China", "India"}};
   
    String[][] words4 = {
    {"Pythagoras", "Euler", "Gauss", "Riemann"},
    {"Wolf", "Fox", "Bear", "Lynx"},
    {"Durian", "Dragonfruit", "Passionfruit", "Guava"},
    {"Jupiter", "Uranus", "Mercury", "Mars"},
    {"Sitar", "Cello", "Xylophone", "Harp"},
    {"Tornado", "Aurora", "Drought", "Monsoon"},
    {"Archaeologist", "Ethnographer", "Numismatist", "Philologist"},
    {"Clavicle", "Scapula", "Sternum", "Cranium"},
    {"Polo", "Pétanque", "Rugby", "Bouldering"},
    {"Estonia", "Chile", "Malaysia", "Kenya"}};
   
    ArrayList<String> wordList = new ArrayList<String>();
   
    //a 2d array (4x4) that has each of the four chosen categories in it and in the correct order
    String[][] connections=new String[4][4];
    //a 2d array (4x4) that has the four chosen categories but scrambled
    String [][] newarr=new String [4][4];

    //constructor
    public Word(){

    }

    //chooses 4 random categories and puts them in the connections array
    public void getCategories(){
    //int 0-9
    int random=(int)(Math.random()*10);
    
    //setting first row of correct answers
    connections[0][0]=words[random][0];
    connections[0][1]=words[random][1];
    connections[0][2]=words[random][2];
    connections[0][3]=words[random][3];
    wordList.add(words[random][0]);
    wordList.add(words[random][1]);
    wordList.add(words[random][2]);
    wordList.add(words[random][3]);

    //another int 0-9
    random=(int)(Math.random()*10);
    //setting second row of correct answers
    connections[1][0]=words2[random][0];
    connections[1][1]=words2[random][1];
    connections[1][2]=words2[random][2];
    connections[1][3]=words2[random][3];
    wordList.add(words2[random][0]);
    wordList.add(words2[random][1]);
    wordList.add(words2[random][2]);
    wordList.add(words2[random][3]);

    //another int 0-9
    random=(int)(Math.random()*10);
    //setting third row of correct answers
    connections[2][0]=words3[random][0];
    connections[2][1]=words3[random][1];
    connections[2][2]=words3[random][2];
    connections[2][3]=words3[random][3];
    wordList.add(words3[random][0]);
    wordList.add(words3[random][1]);
    wordList.add(words3[random][2]);
    wordList.add(words3[random][3]);

    //another int 0-9
    random=(int)(Math.random()*10);

    //setting fourth row of correct answers
    connections[3][0]=words4[random][0];
    connections[3][1]=words4[random][1];
    connections[3][2]=words4[random][2];
    connections[3][3]=words4[random][3];
    wordList.add(words4[random][0]);
    wordList.add(words4[random][1]);
    wordList.add(words4[random][2]);
    wordList.add(words4[random][3]);
    }

    //returns the correct answer array
    public String[][] getAnswer(){
    return connections;
    }

    //returns the scrambled array
    public String[][] getScrambled(){
    return newarr;
    }

    //prints out the array given
    public void print(String[][] arr){
    int counter1=0;
    int counter2=0;

    for(int i=0; i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    }

    //randomizes/scrambles the answers and puts it into newarr
    public String[][] randomize(){
       
        //makes a new 2d array (4x4) w/ all the words from original answers scrambled
        for(int i=0; i<connections.length;i++){
    for(int j=0;j<connections[0].length;j++){
        int random=(int)(Math.random()*wordList.size());
        newarr[i][j]=wordList.get(random);
        wordList.remove(random);
        }
    }
    return newarr;
    }

    //checks their guess to see if it's the correct answer
    public boolean checkGuess(String a, String b, String c, String d){
    boolean isRight1=false;
    boolean isRight2=false;
    boolean isRight3=false;
    boolean isRight4=false;

    int rowindex=-1;
     for(int i=0; i<connections[0].length;i++){
        for(int j=0;j<connections[0].length;j++){
    if(connections[i][j].equals(a)){
    rowindex=i;
        }
    }
    }


    for(int counter=0; counter<connections[0].length;counter++){
        if(connections[rowindex][counter].equals(a)){
            isRight1=true;
        }
    }

    for(int counter=0; counter<connections[0].length;counter++){
        if(connections[rowindex][counter].equals(b)){
            isRight2=true;
        }
    }


    for(int counter=0; counter<connections[0].length; counter++){
        if(connections[rowindex][counter].equals(c)){
            isRight3=true;
        }
    }

    for(int counter=0; counter<connections[0].length; counter++){
        if(connections[rowindex][counter].equals(d)){
            isRight4=true;
        }
    }

    if(isRight1==true && isRight2==true && isRight3==true && isRight4==true){
        return true;
    }
        return false;

    }




}


//ORIGINAL CODE//
// class main {        
// 	public static void main(String args[]) {
	   // System.out.println("------------------------------------------------------------------------------------------------------");
	   // System.out.println("CONNECTIONS: Sort 4 categories of 4 words.");
	   // System.out.println("You will be given a 4x4 grid filled with random words that can be sorted into 4 different categories.");
	   // System.out.println("Input 4 valid coordinates to solve a category.");
	   // System.out.println("You have 3 lives before you lose.");
	   // System.out.println("------------------------------------------------------------------------------------------------------");
	   // System.out.println("           **These are the coordinates of the grid**");
	   // System.out.println("                  -------------------------");
	   // System.out.println("                  |- 1 -|- 2 -|- 3 -|- 4 -|");
	   // System.out.println("                  |- 5 -|- 6 -|- 7 -|- 8 -|           **IF A CATEGORY IS GUESSED CORRECTLY:");
	   // System.out.println("                  |- 9 -|- 10-|- 11-|- 12-|           -the 4 words with be replaced with -> ✅✅✅✅");
	   // System.out.println("                  |- 13-|- 14-|- 15-|- 16-|");
	   // System.out.println("                  -------------------------");
	   // System.out.println("------------------------------------------------------------------------------------------------------");
// 	    // ArrayList with 40 categories of related words
// 	    String [] arr = {"Democracy", "Plutocracy", "Oligarchy", "Republic", 
// 	    "Symphony", "Crescendo", "Opus", "Sonata", 
// 	    "Photosynthesis", "Photons", "Stomata", "Chloroplast", 
// 	    "Adventure", "Perilous", "Expedition", "Odyssey", 
// 	    "Renaissance", "Humanism", "Reformation", "Patronage", 
// 	    "Bug", "Mike", "Tap", "Wire", 
// 	    "Genetics", "Allele", "Genotype", "Heredity", 
// 	    "Nerd", "Skull", "Eggplant", "Poop", 
// 	    "Shakespeare", "Soliloquy", "Tragedy", "Sonnet", 
// 	    "Microbiology", "Pathogen", "Microbe", "Antibiotic", 
// 	    "Instrument", "Pawn", "Puppet", "Tool", 
// 	    "Crystal", "Disco", "Foul", "Gutter", 
// 	    "Innovation", "Disruption", "Paradigm", "Ingenuity", 
// 	    "Basketball", "Carrot", "Goldfish", "Pumpkin", 
// 	    "Enlightenment", "Rationalism", "Voltaire", "Montesquieu", 
// 	    "Dystopia", "Authoritarianism", "Surveillance", "Despotism", 
// 	    "Art", "Impressionism", "Cubism", "Surrealism", 
// 	    "Bar", "Final", "Oral", "Physical", 
// 	    "Literature", "Canon", "Prose", "Poetics", 
// 	    "Chess", "Checkers", "Go", "Sorry", 
// 	    "Dust", "Pepper", "Pollen", "Smoke", 
// 	    "Follow", "Like", "Share", "Subscribe", 
// 	    "Love", "Eros", "Agape", "Philia", 
// 	    "Otter", "Museum", "Marine", "Tank",
// 	    "Erm", "Uh", "Um", "Well",
// 	    "Hold", "Stall", "Delay", "Shelf", 
// 	    "Flush", "Drain", "Clear", "Empty", 
// 	    "Psychology", "Psychoanalysis", "Behaviorism", "Gestalt", 
// 	    "Capsule", "Cream", "Syrup", "Tablet", 
// 	    "Cover", "Love", "Scarlet", "Apology", 
// 	    "Adventure", "Discovery", "Perseverance", "Expedition", 
// 	    "Bunny", "Egg", "Jelly Bean", "Peep", 
// 	    "Neuroplasticity", "Malleability", "Adaptation", "Synaptic pruning", 
// 	    "Button", "Collar", "Cuff", "Pocket", 
// 	    "Bond", "Link", "Relation", "Tie", 
// 	    "Cabin", "Engine", "Nose", "Wing", 
// 	    "Music", "Atonality", "Scale", "Accent",
// 	    "Associate", "Fellow", "Partner", "Peer",
// 	    "Linguistics", "Phonemes", "Morphemes", "Syntax",
// 	    "Bath", "Card", "Curtain", "Picture"};
        
//         // 2D array containing the words 4x4
//         String [][] dee2 = new String[4][4];
        
//             String a,b,c,d,
//                   a2,b2,c2,d2, 
//                   a3,b3,c3,d3, 
//                   a4,b4,c4,d4;
//             int one = (int)(Math.random()*40+1);
//             // selecting the first category!
//             if(one<=4){
//             a = arr[0];
//             b = arr[1];
//             c = arr[2];
//             d = arr[3];
//             }
//             else if(one<=8){
//             a = arr[4];
//             b = arr[5];
//             c = arr[6];
//             d = arr[7];
//             }
//             else if(one<=12){
//             a = arr[8];
//             b = arr[9];
//             c = arr[10];
//             d = arr[11];
//             }
//             else if(one<=16){
//             a = arr[12];
//             b = arr[13];
//             c = arr[14];
//             d = arr[15];
//             }
//             else if(one<=20){
//             a = arr[16];
//             b = arr[17];
//             c = arr[18];
//             d = arr[19];
//             }
//             else if(one<=24){
//             a = arr[20];
//             b = arr[21];
//             c = arr[22];
//             d = arr[23];
//             }
//             else if(one<=28){
//             a = arr[24];
//             b = arr[25];
//             c = arr[26];
//             d = arr[27];
//             }
//             else if(one<=32){
//             a = arr[28];
//             b = arr[29];
//             c = arr[30];
//             d = arr[31];
//             }
//             else if(one<=36){
//             a = arr[32];
//             b = arr[33];
//             c = arr[34];
//             d = arr[35];
//             }
//             else if(one<=40){
//             a = arr[36];
//             b = arr[37];
//             c = arr[38];
//             d = arr[39];
//             }
//             else{
//             a = ("");
//             b = ("");
//             c = ("");
//             d = ("");
//             }
            
//             //selecting the second category!!
//             int two = (int)(Math.random()*40+1);
//             if(two<=4){
//             a2 = arr[40];
//             b2 = arr[41];
//             c2 = arr[42];
//             d2 = arr[43];
//             }
//             else if(two<=8){
//             a2 = arr[44];
//             b2 = arr[45];
//             c2 = arr[46];
//             d2 = arr[47];
//             }
//             else if(two<=12){
//             a2 = arr[48];
//             b2 = arr[49];
//             c2 = arr[50];
//             d2 = arr[51];
//             }
//             else if(two<=16){
//             a2 = arr[52];
//             b2 = arr[53];
//             c2 = arr[54];
//             d2 = arr[55];
//             }
//             else if(two<=20){
//             a2 = arr[56];
//             b2 = arr[57];
//             c2 = arr[58];
//             d2 = arr[59];
//             }
//             else if(two<=24){
//             a2 = arr[60];
//             b2 = arr[61];
//             c2 = arr[62];
//             d2 = arr[63];
//             }
//             else if(two<=28){
//             a2 = arr[64];
//             b2 = arr[65];
//             c2 = arr[66];
//             d2 = arr[67];
//             }
//             else if(two<=32){
//             a2 = arr[68];
//             b2 = arr[69];
//             c2 = arr[70];
//             d2 = arr[71];
//             }
//             else if(two<=36){
//             a2 = arr[72];
//             b2 = arr[73];
//             c2 = arr[74];
//             d2 = arr[75];
//             }
//             else if(two<=40){
//             a2 = arr[76];
//             b2 = arr[77];
//             c2 = arr[78];
//             d2 = arr[79];
//             }
//             else{
//             a2 = ("");
//             b2 = ("");
//             c2 = ("");
//             d2 = ("");
//             }
            
//             //selecting the third category!!!
//             int three = (int)(Math.random()*40+1);
//             if(three<=4){
//             a3 = arr[80];
//             b3 = arr[81];
//             c3 = arr[82];
//             d3 = arr[83];
//             }
//             else if(three<=8){
//             a3 = arr[84];
//             b3 = arr[85];
//             c3 = arr[86];
//             d3 = arr[87];
//             }
//             else if(three<=12){
//             a3 = arr[88];
//             b3 = arr[89];
//             c3 = arr[90];
//             d3 = arr[91];
//             }
//             else if(three<=16){
//             a3 = arr[92];
//             b3 = arr[93];
//             c3 = arr[94];
//             d3 = arr[95];
//             }
//             else if(three<=20){
//             a3 = arr[96];
//             b3 = arr[97];
//             c3 = arr[98];
//             d3 = arr[99];
//             }
//             else if(three<=24){
//             a3 = arr[100];
//             b3 = arr[101];
//             c3 = arr[102];
//             d3 = arr[103];
//             }
//             else if(three<=28){
//             a3 = arr[104];
//             b3 = arr[105];
//             c3 = arr[106];
//             d3 = arr[107];
//             }
//             else if(three<=32){
//             a3 = arr[108];
//             b3 = arr[109];
//             c3 = arr[110];
//             d3 = arr[111];
//             }
//             else if(three<=36){
//             a3 = arr[112];
//             b3 = arr[113];
//             c3 = arr[114];
//             d3 = arr[115];
//             }
//             else if(three<=40){
//             a3 = arr[116];
//             b3 = arr[117];
//             c3 = arr[118];
//             d3 = arr[119];
//             }
//             else{
//             a3 = ("");
//             b3 = ("");
//             c3 = ("");
//             d3 = ("");
//             }
            
//             //selecting the fourth category!!!!
//             int four = (int)(Math.random()*40+1);
//             if(four<=4){
//             a4 = arr[120];
//             b4 = arr[121];
//             c4 = arr[122];
//             d4 = arr[123];
//             }
//             else if(four<=8){
//             a4 = arr[124];
//             b4 = arr[125];
//             c4 = arr[126];
//             d4 = arr[127];
//             }
//             else if(four<=12){
//             a4 = arr[128];
//             b4 = arr[129];
//             c4 = arr[130];
//             d4 = arr[131];
//             }
//             else if(four<=16){
//             a4 = arr[132];
//             b4 = arr[133];
//             c4 = arr[134];
//             d4 = arr[135];
//             }
//             else if(four<=20){
//             a4 = arr[136];
//             b4 = arr[137];
//             c4 = arr[138];
//             d4 = arr[139];
//             }
//             else if(four<=24){
//             a4 = arr[140];
//             b4 = arr[141];
//             c4 = arr[142];
//             d4 = arr[143];
//             }
//             else if(four<=28){
//             a4 = arr[144];
//             b4 = arr[145];
//             c4 = arr[146];
//             d4 = arr[147];
//             }
//             else if(four<=32){
//             a4 = arr[148];
//             b4 = arr[149];
//             c4 = arr[150];
//             d4 = arr[151];
//             }
//             else if(four<=36){
//             a4 = arr[152];
//             b4 = arr[153];
//             c4 = arr[154];
//             d4 = arr[155];
//             }
//             else if(four<=40){
//             a4 = arr[156];
//             b4 = arr[157];
//             c4 = arr[158];
//             d4 = arr[159];
//             }
//             else{
//             a4 = ("");
//             b4 = ("");
//             c4 = ("");
//             d4 = ("");
//             }
            
//             // making an arrayList of the 4 chosen categories of words
//             ArrayList<String> chosen = new ArrayList<String>();
//             chosen.add(a);
//             chosen.add(b);
//             chosen.add(c);
//             chosen.add(d);
//             chosen.add(a2);
//             chosen.add(b2);
//             chosen.add(c2);
//             chosen.add(d2);
//             chosen.add(a3);
//             chosen.add(b3);
//             chosen.add(c3);
//             chosen.add(d3);
//             chosen.add(a4);
//             chosen.add(b4);
//             chosen.add(c4);
//             chosen.add(d4);
            
//             // filling the 2d array with spaces
//             for(int row=0; row<dee2.length; row++){
//                 for(int col=0; col<dee2[0].length; col++){
//                     dee2[row][col] = (" "); 
//                 }
//             }
            
//             // assigning values of the arrayList to the 2d array in a random order
//                     while(dee2[0][0].indexOf(" ")!=-1 || dee2[0][1].indexOf(" ")!=-1 || dee2[0][2].indexOf(" ")!=-1 || dee2[0][3].indexOf(" ")!=-1 || dee2[1][0].indexOf(" ")!=-1 || dee2[1][1].indexOf(" ")!=-1 || dee2[1][2].indexOf(" ")!=-1 || dee2[1][3].indexOf(" ")!=-1 || dee2[2][0].indexOf(" ")!=-1 || dee2[2][1].indexOf(" ")!=-1 || dee2[2][2].indexOf(" ")!=-1 || dee2[2][3].indexOf(" ")!=-1 || dee2[3][0].indexOf(" ")!=-1 || dee2[3][1].indexOf(" ")!=-1 || dee2[3][2].indexOf(" ")!=-1 || dee2[3][3].indexOf(" ")!=-1) {
//                         int cat = (int)(Math.random()*4);
//                         int penguin = (int)(Math.random()*4);
                        
//                         int chosenSize = 16;
//                         int pencat = (int)(Math.random()*chosenSize+1);
//                         if(dee2[cat][penguin].indexOf(" ")!=-1){
//                         dee2[cat][penguin] = chosen.get(pencat);
//                         chosen.remove(pencat);
//                         chosenSize--;
//                         }
                        
//                     }
            
//             //assigning variables to all coordinates of the 2d array
//             String kim1 = dee2[0][0];
//             String kim2 = dee2[0][1];
//             String kim3 = dee2[0][2];
//             String kim4 = dee2[0][3];
//             String kim5 = dee2[1][0];
//             String kim6 = dee2[1][1];
//             String kim7 = dee2[1][2];
//             String kim8 = dee2[1][3];
//             String kim9 = dee2[2][0];
//             String kim10 = dee2[2][1];
//             String kim11 = dee2[2][2];
//             String kim12 = dee2[2][3];
//             String kim13 = dee2[3][0];
//             String kim14 = dee2[3][1];
//             String kim15 = dee2[3][2];
//             String kim16 = dee2[3][3];
//             // printing the 2d grid with the assigned values
//         System.out.println("                  ----------------------------------------------------");
// 	    System.out.println("                  |-"+kim1+"-|-"+kim2+"-|-"+kim3+"-|-"+kim4+"-|");
// 	    System.out.println("                  |-"+kim5+"-|-"+kim6+"-|-"+kim7+"-|-"+kim8+"-|");
// 	    System.out.println("                  |-"+kim9+"-|-"+kim10+"-|-"+kim11+"-|-"+kim12+"-|");
// 	    System.out.println("                  |-"+kim13+"-|-"+kim14+"-|-"+kim15+"-|-"+kim16+"-|");
// 	    System.out.println("                  ----------------------------------------------------");

// 	}
// }