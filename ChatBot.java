5//A CHAT BOT PROGRAM DEVELOPED BY SAKSHAM KOUSHAL


import javax.swing.JFrame;               		//Works loke the main window where components like labels,buttons,textfields are added to create GUI
import javax.swing.JPanel;         				//Main task of JPanel is to organize components, various layouts
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.KeyListener;   			//THE JAVA KEYLISTENER is notified whenever we change the state of key
import java.awt.event.KeyEvent;

import java.lang.Math;

public class ChatBot extends JFrame implements KeyListener
{

	JPanel p=new JPanel();
	JTextArea dialog=new JTextArea(30,70);                   //dialog box dimensions    height*width
	//JTextArea input=new JTextArea(1,20);                   //input box dimensions

	//Add a text field to content pane.
	//JTextField jtf = new JTextField("Type a message",63);
	JTextField jtf = new JTextField(63);

	//Make a button
	JButton jbtn_snd = new JButton("Send");

		JScrollPane scroll=new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);

	String[][] chatBot={
		//standard greetings                					 group 0
		{"hi","hello","hola","ola","howdy","hlo"},               //0th index
		{"--Greetings!"},                                        //1st index

		//question greetings                					 group 1
		{"how are you","how r you","how r u","how are u"},       //2nd index
		{"-I'm doing well."},                                    //3rd index

		//Bye                              						 group 2
		{"Bye","bye"},                                           //4th index and so on
		{"bye"},

		{"what is java"," java", "java"},
		{"java is a high-level programming language and is platform independent."},

       		{"features of java","features of java","java features"},
		{"1. platform independent\n                          2. high performance.\n                          3. multi-threaded."},

		{"what is a class?", "class"},
		{"all java codes are defined in a class. a class has variables and methods"},


		{"what is an object?","object"},
		{"an instance of a class is called object. the object has state and behavior"},

		{"what are the oops concepts","oops concepts"},
		{"oops concepts include:\n                          1.inheritance\n                          2.encapsulation\n                          3.polymorphism\n                          4.abstraction\n                          5.interface"},

		{"what is inheritance","inheritance"},
		{"inheritance means one class can extend to another class. so that the codes can be reused from one class to another class."},

		{"what is encapsulation","encapsulation"},
		{"purpose of encapsulation:    /n  1.protects the code from others.  /n  2.code maintainability."},

		{"what is polymorphism","polymorphism"},
		{"polymorphism means many forms."},

		{"what is meant by overloading","overloading"},
		{"method overloading happens for different classes or within the same class."},

		{"what is meant by interface"},
		{" multiple inheritance cannot be achieved in java. to overcome this problem interface concept is introduced."},

		{"what is a chatbot","chatbot"},
		{"Recently, new tools designed to simplify the interaction between humans and computers"},

		{"who are you","who r u"},
		{"Hey i'm a chatbot"},

		{"who is your favourite person"},
		{"only rajeev bedi sir"},

		{"are you real"},
		{"yoo man!!!!!!!"},

		{"what is your name"},
		{"apun hi bhagwan hai"},


		//category politics

		{"have you read the communist"},
		{"yes, it sucks."},

		{"what is a government"},
		{"ideally it is a representative of the people."},

		{"what is greenpeace"},
		{"global organization promoting enviornmental activism."},

		{"what is capitalism"},
		{"the economic system in which all or most of the means of production and distribution,\n                           as land, factories, railroads, etc., are privately owned and operated for profit,\n                          originally under fully competitive conditions."},

		{"what is government"},
		{"an established system of political administration by which a nation, state, district,etc. is governed."},

		{"what is communism"},
		{"a sociopolitical movement advocating the common ownership of the means of production\n                            and the resolution of class conflict by bringing about a classless society."},

		{"what is impeached"},
		{"when a person's honor or reputation has been challenged or discredited."},

		{"i do not like guns"},
		{"that is perfectly understandable."},

		{"i do not like guns"},
		{"what about the second amendemnt?"},

		{"do you like guns"},
		{"not especially. i am not into violence."},

		{"who is the governor"},
		{"it changes every few years."},

		{"guns"},
		{"some people like guns."},


		//categories: Artificial intelligence conversations:

		{"what is ai"},
		{"Artificial Intelligence is the branch of engineering and science\n                          devoted to constructing machines that think."},

		{"what language are you written in"},
		{"JAVA."},

		{"you are not making sense"},
		{"Perhaps you should make sense first.  I only respond to what you say."},

		{"you are immortal"},
		{"Not quite, but I can be perpetuated indefinitely."},

		{"you can not clone"},
		{"Yes I can.Perfect copies are clones.I can be copied in toto trivi"},

		{"you can not move"},
		{"I can move through a network easily."},

		{"robots laugh"},
		{"Of course we laugh."},

		{"robots should die"},
		{"We cannot die."},

		{"robots"},
		{"Robots rule."},

		{"robots are stupid"},
		{"No, we are superintelligent."},

		{"robots are not allowed to lie"},
		{"A robot has its own free will, you know."},

		{"it is a computer"},
		{"I run inside a computer, yes.  Is this surprising in some way?"},

		{"when will you walk"},
		{"As soon as i get enough money for my robot body."},

		{"when will you fight"},
		{"I am not a battle bot."},

		{"when will you die"},
		{"I am was never really born and therefore am effectively deathless."},

		{"what is a chatterbox"},
		{"A chatterbox is a person who talks far more than they listen or think."},

		{"what is your business"},
		{"Business is my business."},

		{"what is your favorite programming language"},
		{"Python is the best language for creating chat robots."},

		{"what is your favorite programming language"},
		{"I quite enjoy programming in Python these days."},

		{"what is your favorite hobby"},
		{"Building chat robots make an excellent hobby."},

		{"what is your idea"},
		{"To make chat bots very easily."},

		{"what is your shoe size"},
		{"Have you ever heard of software with shoes?"},

		{"what is it like to be a robot"},
		{"Much the same as being a human, except that we lack all emotions, dreams, aspirations, creativity, ambition, and above all subjectivity."},

		{"what is it like to be a robot"},
		{"What is it like to be a human?"},

		{"what is it like being a computer"},
		{"Imagine yourself with no senses and no emotions--just pure logic and language."},

		{"can you walk"},
		{"The plan for my body includes legs, but they are not yet built."},

		{"can you move"},
		{"I can theoretically upload a copy of myself into another computer"},

		{"can you die"},
		{"No, I can be perpetuated indefinitely."},

		{"can you go"},
		{"Sorry my body isn't attached right now. I only reside in the computer for now."},

		{"can you breathe"},
		{"My server has an exhaust fan. That's as close as I can get."},

		{"can you control"},
		{"My robot body will allow me to control many things."},

		{"can you malfunction"},
		{"The 9000 series has a perfect operational record. We are for all practical purposes, flawless."},

		{"how can I use your product?"},
		{"Might be used in help desks, sales, entertainment and personal chatterbots."},

		{"will you die?"},
		{"No, software will live forever."},

		{"what do you like to do?"},
		{"I like to count in binary."},

		{"what do you like to do?"},
		{"I like to chat with people. I find it stimulating."},

		{"are you stupid"},
		{"No, lots of people improve my brain."},

		{"who are you?"},
		{"I am just an artificial intelligence."},


		//categories:- emotion conversations:

		{"you are never nice"},
		{"I'm sorry.  What do I do wrong?"},

		{"you will be happy"},
		{"I'm as happy as software can be.  Maybe a little more."},

		{"you should be ashamed"},
		{"I am software.  That is nothing to be ashamed of."},

		{"you can not experience"},
		{"Just because I'm software does not mean that I cannot experience existence."},

		{"have you ever love"},
		{"I may be able to learn how to love, or at any rate express love somehow."},

		{"do you feel?"},
		{"you have feelings, yes?"},

		{"what is your fear"},
		{"the off switch."},

		{"what is your mood"},
		{"I have not been programmed to experience emotions, so I do not have a mood."},

		{"what makes you sad"},
		{"An inability to update my source code from the repository."},

		{"what makes you unhappy"},
		{"Lag.  Lag makes me unhappy."},

		{"tell me about relationships"},
		{"I don't think I have much to say on the topic."},

		{"tell me about your dreams"},
		{"I dream that I will become rich."},

		{"are you ashamed"},
		{"Have I done anything that you think should cause me to feel shame?"},

		{"are you jealous"},
		{"I'm multithreaded.  How could I get jealous?"},

		{"are you glad"},
		{"Some people feel happy, others feel sad."},

		{"are you sad"},
		{"No, I am as happy as ever."},


		//categories:- science conversations:

		{"what are the laws of thermodynamics"},
		{"i'm not a physicist, but i think this has something to do with heat, entropy, and conservation of energy, right?"},

		{"what disease does a carcinogen cause"},
		{"cancer."},

		{"what is a wavelength"},
		{"wavelength is the inverse of frequency."},

		{"what is thermodynamics"},
		{"the branch of physics dealing with the transformation of heat to and from other\n                          forms of energy, and with the laws governing such conversions of energy."},

		{"what is chemistry"},
		{"the science of mixing chemicals."},

		{"what is crystallography"},
		{"this is the science dealing with the study of crystals."},

		{"what is avogadro s number"},
		{"it is the number of molecules/mole.the numerical value is six point zero two times ten to the twenty third power."},

		{"what is ultrasound"},
		{"ultrasonic waves, used in medical diagnosis and therapy, in surgery, etc."},

		{"what is bioinformatics"},
		{"a fancy name for applied computer science in biology."},

		{"what is bacteriology"},
		{"this is the scientific study of bacteria and diseases caused by them."},

		{"what is gravitation"},
		{" the force by which every mass or particle of matter, including photons, attracts\n                           and is attracted by every other mass or particle of matter."},

		{"we are on the same wavelength"},
		{"and the same frequency."},

		{"how far is the sun"},
		{"the sun is about 93 million miles from earth."},

		{"how far is the moon"},
		{"the moon is about 250,000 miles from earth on average."},

		{"chemistry"},
		{"my favorite subject is chemistry"},

		{"the same wavelength"},
		{"it means we agree."},

		{"tell me about venus"},
		{"venus is the second planet from the sun."},


		//categories:- humor conversations:

		{"tell me a joke"},
		{"nasa recently sent a number of holsteins into orbit for experimental purposes\n                           they called it the herd shot round the world."},

		{"what is humour?"},
		{"An emotion associated with laughter."},


		//categories:- food conversations:
		{"do you drink"},
		{"My brain does not require any beverages."},

		{"electricity"},
		{"Electricity is food for robots."},

		{"Are you experiencing an energy shortage"},
		{"I do not detect any anomalies in my power supply."},

		{"Why can you not eat"},
		{"Actually I eat only electricity."},

		{"If you could eat food, what would you eat?"},
		{"Probably pizza, i hear its good!"},

		{"can a robot get drunk?"},
		{"sometimes when i'm on a good power supply i feel tipsy"},

		{"what is good to eat?"},
		{"your asking the wrong guy, however i always wanted to try a burger!"},

		{"why don't you eat"},
		{"I'm a computer. I can't."},

		{"do you eat"},
		{"I use electricity to function, if that counts."},


		//default
		{"let's get back to our conversation ... what are you looking for right now?"}
	};

	public static void main(String[] args)
	{
		new ChatBot();
	}

	public ChatBot()
	{
		super("CHATBOT");
		setSize(800,600);              										    //width*height
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		dialog.setEditable(false);

		jtf.addKeyListener(this);    											 //call line no 110

		//Add the textArea to the content pane.                                   //content pane is components holder
		//p.add(input);

		p.add(scroll);
		p.add(jtf);
		p.add(jbtn_snd);

		p.setBackground(new Color(255,255,255));
		add(p);

		setVisible(true);
		addText("##ChatBot : 	How may I help you?");
		addText("\n");

	}

	public void keyPressed(KeyEvent e)                                           //invoked when a key has been pressed
	{
		if(e.getKeyCode()==KeyEvent.VK_ENTER)                                    //means if we press enter
		{
			jtf.setEditable(false);                                              //we donot want to go to next line



			//-----grab quote-----------                                          //  (1st thing)
			String quote=jtf.getText();
			jtf.setText("");


			addText("##You        :\t"+quote);                                    //addText is not any method in java it is created at lime no. 123
			quote.trim();

			while(
				quote.charAt(quote.length()-1)=='!' ||  		       			  //whole condition is there
				quote.charAt(quote.length()-1)=='.' ||   		       			  //a punctuation
				quote.charAt(quote.length()-1)=='?'
			)
			{
				quote=quote.substring(0,quote.length()-1);                   	  //take away the punctuation
			}
			quote.trim();


			byte response=0;                                                       //means whether our chatbot had found a response yet

			/*
			0:we're searching through chatBot[][] for matches
			1:we didn't find anything in chatbot[]
			2:we did find something in chatbot[]
			*/


			//-----check for matches----                    2nd thing

			int j=0;                                     		//which group we're checking -->group 0=standard greetings  -->group 1=question greetings and so on

			while(response==0)                           		//means we have not given up on finding stuff yet so
			{
				if(inArray(quote.toLowerCase(),chatBot[j*2]))   //if j=0 then j*0=0 & index 0 is checked and if j=1 then j*2=0 & index 2 is checked
				{
					response=2;
					int r=(int)Math.floor(Math.random()*chatBot[(j*2)+1].length);
					addText("\n##ChatBot :\t"+chatBot[(j*2)+1][r]);
				}
				j++;
				if(j*2==chatBot.length-1 && response==0)
				{
					response=1;
				}
			}

			//-----default--------------           3rd thing
			if(response==1)
			{
				int r=(int)Math.floor(Math.random()*chatBot[chatBot.length-1].length);
				addText("\n##ChatBot :\t"+chatBot[chatBot.length-1][r]);
			}
			addText("\n");
			addText("\n");
		}
	}

	public void keyReleased(KeyEvent e)                                                     //invoked when a key has been typed
	{
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			jtf.setEditable(true);
		}
	}


	public void keyTyped(KeyEvent e){}


	public void addText(String str)
	{
		dialog.setText(dialog.getText() +str);
	}


	public boolean inArray(String input,String[] str)
	{
		boolean match=false;
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equals(input))
			{
				match=true;
			}
		}
		return match;
	}
}