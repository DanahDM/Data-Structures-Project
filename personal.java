package projectds;
/*
 @author team 7
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicScrollBarUI;
public class personal implements ActionListener {
@Override
public void actionPerformed(ActionEvent ae) {
Border border = BorderFactory.createLineBorder(Color.BLACK);
              
        JFrame frame = new JFrame(); //create a Frame
        frame.setTitle("INDIVIDUAL"); //titel of frame
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
        
        frame.setSize(650 ,650); //size x-dimension , y-dimensiob
       
        frame.getContentPane().setBackground(new Color(0xddb7ab)); //this one2
        frame.setVisible(true);// make frame visibale.
        frame.setLayout(null);
                

        //label section
        JLabel labl = new JLabel(); //create Label
        labl.setText(" The  Individual code is  here:");//Set text of label
        labl.setFont(new Font("MV boli", Font.ITALIC,30)); //set font of text
        labl.setBounds(45, 0, 500, 100);
         
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(45, 100, 530, 440);
        panel1.setLayout(null);
        panel1.setBackground(new Color(0xf4eeed) );
        panel1.setBorder(border);

        //button section.
        JButton jumanah = new JButton("jumanah"); //create button
        JButton maha = new JButton("Maha");//create button
        JButton Roaa = new JButton("Roaa");//create button
        JButton Amjad = new JButton("Amjad");//create button
        JButton Dana = new JButton("Dana");//create button
        JButton Shahad = new JButton("Shahad");//create button
        jumanah.setBounds(100,60,120,70); //set size.
        jumanah.setBackground(new Color(0xf7f7fb));//set color 
        jumanah.setForeground(Color.black);//set font color
        jumanah.setFont(new Font("MV boli", Font.ITALIC,18));//set font of text
        
        maha.setBounds(100,185,120,70);
        maha.setBackground(new Color(0xf5dec9));
        maha.setForeground(Color.black);
        maha.setFont(new Font("MV boli", Font.ITALIC,18));
        maha.setHorizontalTextPosition(JButton.CENTER);
        maha.setVerticalTextPosition(JButton.TOP);
 
        Roaa.setBounds(100, 310, 120, 70);
         
        Roaa.setBackground(new Color(0xe7c3a0));
        Roaa.setForeground(Color.black);
        Roaa.setFont(new Font("MV boli", Font.ITALIC,18));
        Roaa.setVerticalAlignment(JButton.CENTER);
        Roaa.setHorizontalAlignment(JButton.CENTER);
        Amjad.setBounds(310,60,120,70);
        Amjad.setVerticalAlignment(JButton.CENTER);
        Amjad.setHorizontalAlignment(JButton.CENTER);
        Amjad.setBackground(new Color(0xf5dec9));
        Amjad.setForeground(Color.black);
        Amjad.setFont(new Font("MV boli", Font.ITALIC,18));
        
        Dana.setBounds(310,185,120,70);
        Dana.setVerticalAlignment(JButton.CENTER);
        Dana.setHorizontalAlignment(JButton.CENTER);
        Dana.setBackground(new Color(0xdece6ef));
         
        Dana.setForeground(Color.black);
        Dana.setFont(new Font("MV boli",Font.ITALIC,18));
        
        Shahad.setBounds(310,310,120,70);
        Shahad.setVerticalAlignment(JButton.CENTER);
        Shahad.setHorizontalAlignment(JButton.CENTER);
        
        Shahad.setBackground(new Color(0xf7f7fb));
        Shahad.setForeground(Color.black);
        Shahad.setFont(new Font("MV boli", Font.ITALIC,18));
       
        //add to frame.
       panel1.add(maha);
       panel1.add(Roaa);
       panel1.add(jumanah);
       panel1.add(Amjad);
       panel1.add(Dana);
       panel1.add(Shahad);
       frame.add(panel1);
       frame.add(labl);
       
       
     //new fram for each student
       
       //1- student jumanah
        JFrame jumanahf = new JFrame(); //create a Frame
        jumanahf.setTitle("jumanah"); //titel of frame
        jumanahf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
        jumanahf.setLayout(null);
        jumanahf.setSize(650 ,650); //size x-dimension , y-dimensiob
        jumanahf.setBackground(new Color(0xddb7ab));
        jumanahf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
        JPanel panelJ = new JPanel();
        panelJ.setBounds(35, 45, 550, 510);
        panelJ.setBackground(new Color(0xf4eeed));
        JLabel labll = new JLabel(); //create Label
        labll.setText(" The Transfer Code(C++)");//Set text of label
        labll.setFont(new Font("MV boli", Font.ITALIC,28)); //set font of text
        labll.setBounds(50, 100, 100, 100);
        JTextArea area = new JTextArea();    
        // setting location of text area in frame  
        area.setPreferredSize(new Dimension(500,1800));
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setText("#include <iostream>\n" +
"\n" +
"using namespace std;\n" +
"\n" +
"class ListNode{\n" +
"public:\n" +
"int data ;\n" +
"ListNode* next;\n" +
"  \n" +
"\n" +
"ListNode(int data){\n" +
"this->data=data;\n" +
"this->next=NULL;\n" +
"\n" +
"}\n" +
"};\n" +
"\n" +
"class SinglyLinkedList{\n" +
"public :\n" +
"  \n" +
"ListNode* head = NULL;\n" +
"void display(){\n" +
"ListNode* current =head;\n" +
"while(current!=NULL){\n" +
"cout<<current->data<<\" \";\n" +
"current=current->next;\n" +
"}\n" +
"cout<<\" null\";\n" +
"}\n" +
"\n" +
"int length (){\n" +
"if(head==NULL){\n" +
"return 0;\n" +
"}\n" +
"ListNode* current = head;\n" +
"int count=0;\n" +
"while(current!=NULL){\n" +
"count++;\n" +
"current=current->next;\n" +
"}\n" +
"return count;\n" +
"}\n" +
"\n" +
"void insertFirst(int value) {\n" +
"if(head == NULL)\n" +
"{\n" +
"head = new ListNode(value);\n" +
"return;\n" +
"}\n" +
"ListNode* newnode= new ListNode(value);\n" +
"newnode->next=head;\n" +
"head=newnode;\n" +
"}\n" +
"\n" +
"ListNode* deleteFirst() {\n" +
"if(head==NULL){\n" +
"return NULL;\n" +
"}\n" +
"ListNode* temp = head;\n" +
"head=head->next;\n" +
"temp->next=NULL;\n" +
"return temp;\n" +
"\n" +
"}\n" +
"};\n" +
"\n" +
"int main(){\n" +
"SinglyLinkedList* sll = new SinglyLinkedList();\n" +
"sll->insertFirst(5);\n" +
"sll->insertFirst(7);\n" +
"sll->deleteFirst();\n" +
"cout<<sll->deleteFirst()->data;\n" +
"sll->display();\n" +
"  \n" +
"}");// code
        area.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
        area.setBackground(new Color(0xf7f7fb));
        panelJ.add(labll);
            
       JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setPreferredSize(new Dimension(450,450));
        scrollPane.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    
            @Override
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}}); 
        scrollPane.setVerticalScrollBarPolicy
        (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      
        //2- student Maha
        JFrame Mahaf = new JFrame(); //create a Frame
        Mahaf.setTitle("Maha"); //titel of frame
        Mahaf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
        Mahaf.setLayout(null);
        Mahaf.setSize(650 ,650); //size x-dimension , y-dimensiob
        Mahaf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
        JPanel panel1M = new JPanel();
        panel1M.setBounds(35, 45, 550, 510);
        panel1M.setBackground(new Color(0xf4eeed));
        JLabel labllM = new JLabel(); //create Label
        labllM.setText(" The Transfer Code(c++) ");//Set text of label
        labllM.setFont(new Font("MV boli",  Font.ITALIC,26)); //set font of text
        labllM.setBounds(50, 100, 100, 100);
        JTextArea area1 = new JTextArea();    
        // setting location of text area in frame  
        area1.setPreferredSize(new Dimension(500,1800));
        area1.setEditable(false);
        area1.setLineWrap(true);
        area1.setWrapStyleWord(true);
        area1.setText("#include <iostream>\n" +
"\n" +
"using namespace std;\n" +
"\n" +
"class ListNode{\n" +
"public:\n" +
"int data ;\n" +
"ListNode* next;\n" +
"  \n" +
"\n" +
"ListNode(int data){\n" +
"this->data=data;\n" +
"this->next=NULL;\n" +
"\n" +
"}\n" +
"};\n" +
"\n" +
"class SinglyLinkedList{\n" +
"public :\n" +
"  \n" +
"ListNode* head = NULL;\n" +
"void display(){\n" +
"ListNode* current =head;\n" +
"while(current!=NULL){\n" +
"cout<<current->data<<\" \";\n" +
"current=current->next;\n" +
"}\n" +
"cout<<\" null\";\n" +
"}\n" +
"\n" +
"int length (){\n" +
"if(head==NULL){\n" +
"return 0;\n" +
"}\n" +
"ListNode* current = head;\n" +
"int count=0;\n" +
"while(current!=NULL){\n" +
"count++;\n" +
"current=current->next;\n" +
"}\n" +
"return count;\n" +
"}\n" +
"\n" +
"void insertFirst(int value) {\n" +
"if(head == NULL)\n" +
"{\n" +
"head = new ListNode(value);\n" +
"return;\n" +
"}\n" +
"ListNode* newnode= new ListNode(value);\n" +
"newnode->next=head;\n" +
"head=newnode;\n" +
"}\n" +
"\n" +
"ListNode* deleteFirst() {\n" +
"if(head==NULL){\n" +
"return NULL;\n" +
"}\n" +
"ListNode* temp = head;\n" +
"head=head->next;\n" +
"temp->next=NULL;\n" +
"return temp;\n" +
"\n" +
"}\n" +
"};\n" +
"\n" +
"int main(){\n" +
"SinglyLinkedList* sll = new SinglyLinkedList();\n" +
"sll->insertFirst(5);\n" +
"sll->insertFirst(7);\n" +
"sll->deleteFirst();\n" +
"cout<<sll->deleteFirst()->data;\n" +
"sll->display();\n" +
"  \n" +
"}");// code
        area1.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
        area1.setBackground(new Color(0xf7f7fb));
        panel1M.add(labllM);    
        JScrollPane scrollPane1 = new JScrollPane(area1);
        scrollPane1.setPreferredSize(new Dimension(450,450));
        scrollPane1.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
        scrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}});       
scrollPane1.setVerticalScrollBarPolicy
(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
           




//3- student Roaa
JFrame Roaaf = new JFrame(); //create a Frame
Roaaf.setTitle("Roaa"); //titel of frame
Roaaf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
Roaaf.setLayout(null);
Roaaf.setSize(650 ,650); //size x-dimension , y-dimensiob
Roaaf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
JPanel panel1R = new JPanel();
panel1R.setBounds(35, 45, 550, 510);
panel1R.setBackground(new Color(0xf4eeed));
JLabel labllR = new JLabel(); //create Label
labllR.setText(" The Transfer Code(Pythone)");//Set text of label
labllR.setFont(new Font("MV boli",  Font.ITALIC,24)); //set font of text
labllR.setBounds(50, 100, 100, 100);
JTextArea area2 = new JTextArea();    
// setting location of text area in frame  
area2.setPreferredSize(new Dimension(500,1500));
area2.setEditable(false);
area2.setLineWrap(true);
area2.setWrapStyleWord(true);
area2.setText("# Node class\n" +
"class Node: \n" +
"    # Function to initialise the node object\n" +
"    def __init__(self, data):\n" +
"        self.data = data  # Assign data\n" +
"        self.next = None  # Initialize next as null\n" +
"\n" +
"\n" +
"# Linked List class contains a Node object\n" +
"class LinkedList:\n" +
"    # Function to initialize head\n" +
"    def __init__(self):\n" +
"        self.head = None\n" +
"\n" +
"\n" +
"    # Functio to insert a new node at the beginning\n" +
"    def push(self, new_data):\n" +
"        # 1 & 2: Allocate the Node &\n" +
"        #Put in the data\n" +
"        new_node = Node(new_data)\n" +
"        # 3. Make next of new Node as head\n" +
"        new_node.next = self.head\n" +
"        # 4. Move the head to point to new Node\n" +
"        self.head = new_node\n" +
"\n" +
"\n" +
"    def pop_front(self):\n" +
"        if(self.head != None):\n" +
"            temp = self.head\n" +
"            self.head = self.head.next \n" +
"            pop = temp.data\n" +
"        return pop \n" +
"\n" +
"    # Utility function to print the linked list\n" +
"    def printList(self):\n" +
"        temp = self.head\n" +
"        while (temp):\n" +
"            print (temp.data, sep=',->')\n" +
"            temp = temp.next\n" +
"        print(\"null\", end = \"\")\n" +
"\n" +
"    def getCount(self):\n" +
"        temp = self.head # Initialise temp\n" +
"        count = 0 # Initialise count\n" +
"        # Loop while end of linked list is not reached\n" +
"        while (temp):\n" +
"            count += 1\n" +
"            temp = temp.next\n" +
"        return count\n" +
"\n" +
"\n" +
"# Code execution starts here\n" +
"if __name__=='__main__':\n" +
"    # Start with the empty list\n" +
"    llist = LinkedList()\n" +
"    llist.push(5);\n" +
"    llist.push(7);\n" +
"    llist.pop_front()\n" +
"    print(llist.pop_front());\n" +
"    print ('Created linked list is:')\n" +
"    llist.printList();");
area2.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
area2.setBackground(new Color(0xf7f7fb));
panel1R.add(labllR);
JScrollPane scrollPane2 = new JScrollPane(area2);
scrollPane2.setPreferredSize(new Dimension(450,450));
scrollPane2.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
scrollPane2.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}});
scrollPane2.setVerticalScrollBarPolicy
(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);




               //4- student Amjad
JFrame Amjadf = new JFrame(); //create a Frame
Amjadf.setTitle("Amjad"); //titel of frame
Amjadf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
Amjadf.setLayout(null);
Amjadf.setSize(650 ,650); //size x-dimension , y-dimensiob
Amjadf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
JPanel panel1A = new JPanel();
panel1A.setBounds(35, 45, 550, 510);
panel1A.setBackground(new Color(0xf4eeed));
JLabel labl11 = new JLabel(); //create Label
labl11.setText(" The Transfer Code(Python)");//Set text of label
labl11.setFont(new Font("MV boli", Font.ITALIC,28)); //set font of text
labl11.setBounds(50, 100, 100, 100);
JTextArea area3 = new JTextArea();    
        // setting location of text area in frame  
area3.setPreferredSize(new Dimension(500,2000));
area3.setEditable(false);
area3.setLineWrap(true);
area3.setWrapStyleWord(true);
area3.setText("class Node:\n" +
"\n" +
"	# Constructor to initialize the node object\n" +
"	def _init_(self, data):\n" +
"		self.data = data\n" +
"		self.next = None\n" +
"\n" +
"class LinkedList:\n" +
"\n" +
"	# Function to initialize head\n" +
"	def _init_(self):\n" +
"		self.head = None\n" +
"\n" +
"	# Function to insert a new node at the beginning\n" +
"	def push(self, new_data):\n" +
"		new_node = Node(new_data)\n" +
"		new_node.next = self.head\n" +
"		self.head = new_node\n" +
"\n" +
"	# Given a reference to the head of a list and a key,\n" +
"	# delete the first occurrence of key in linked list\n" +
"	def deleteNode(self, key):\n" +
"		\n" +
"		# Store head node\n" +
"		temp = self.head\n" +
"\n" +
"		# If head node itself holds the key to be deleted\n" +
"		if (temp is not None):\n" +
"			if (temp.data == key):\n" +
"				self.head = temp.next\n" +
"				temp = None\n" +
"				return\n" +
"\n" +
"		# Search for the key to be deleted, keep track of the\n" +
"		# previous node as we need to change 'prev.next'\n" +
"		while(temp is not None):\n" +
"			if temp.data == key:\n" +
"				break\n" +
"			prev = temp\n" +
"			temp = temp.next\n" +
"\n" +
"		# if key was not present in linked list\n" +
"		if(temp == None):\n" +
"			return\n" +
"\n" +
"		# Unlink the node from linked list\n" +
"		prev.next = temp.next\n" +
"\n" +
"		temp = None\n" +
"\n" +
"\n" +
"	# Utility function to print the linked LinkedList\n" +
"	def printList(self):\n" +
"		temp = self.head\n" +
"		while(temp):\n" +
"			print (\" %d\" %(temp.data)),\n" +
"			temp = temp.next\n" +
"\n" +
"\n" +
"# Driver program\n" +
"llist = LinkedList()\n" +
"llist.push(7)\n" +
"llist.push(5)\n" +
"print (\"Created Linked List: \")\n" +
"llist.printList()\n" +
"llist.deleteNode(7)\n" +
"print (\"\\nLinked List after Deletion:\")\n" +
"llist.printList()");// code
area3.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
area3.setBackground(new Color(0xf7f7fb));
panel1A.add(labl11);
JScrollPane scrollPane3 = new JScrollPane(area3);
scrollPane3.setPreferredSize(new Dimension(450,450));
scrollPane3.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
scrollPane3.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}});      
scrollPane3.setVerticalScrollBarPolicy
(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);





                  //5- student Dana
JFrame Danaf = new JFrame(); //create a Frame
Danaf.setTitle("Dana"); //titel of frame
Danaf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
Danaf.setLayout(null);
Danaf.setSize(650 ,650); //size x-dimension , y-dimensiob
Danaf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
JPanel panel1d = new JPanel();
panel1d.setBounds(35, 45, 550, 510);
panel1d.setBackground(new Color(0xf4eeed));
JLabel lablld = new JLabel(); //create Label
lablld.setText("The Transfer Code(Pythone) ");//Set text of label
lablld.setFont(new Font("MV boli",  Font.ITALIC,28)); //set font of text
lablld.setBounds(50, 100, 100, 100);
JTextArea area4 = new JTextArea();    
        // setting location of text area in frame  
area4.setPreferredSize(new Dimension(500,1200));
area4.setEditable(false);
area4.setLineWrap(true);
area4.setWrapStyleWord(true);
area4.setText("def _init_(self): \n" +
"        self.head = None\n" +
"    \n" +
"    class ListNode: \n" +
"        def _init_(self, data): \n" +
"            self.data = data\n" +
"            self.next = None\n" +
"            \n" +
"    def display(self): \n" +
"        current = self.head\n" +
"        while (current != None): \n" +
"            print(str(current.data) + \" --> \", end = \"\")\n" +
"            current = current.next\n" +
"        print(\"null\", end = \"\")\n" +
"    \n" +
"    def length(self): \n" +
"        if (self.head == None): \n" +
"            return 0\n" +
"        count = 0\n" +
"        current = self.head\n" +
"        while (current != None):\n" +
"            count += 1\n" +
"            current = current.next\n" +
"        return count\n" +
"    \n" +
"    def insertFirst(self, value):\n" +
"        newNode = self.ListNode(value)\n" +
"        newNode.next = self.head\n" +
"        self.head = newNode\n" +
"        \n" +
"    def deleteFirst(self): \n" +
"        if (self.head == None): \n" +
"            return None\n" +
"        temp = self.head\n" +
"        self.head = self.head.next\n" +
"        temp.next = None\n" +
"        return temp\n" +
"        \n" +
"\n" +
"if _name_ == \"_main_\":\n" +
"    sll = SinglyLinkedList()\n" +
"    sll.insertFirst(5)\n" +
"    sll.insertFirst(7)\n" +
"    sll.deleteFirst()\n" +
"    print(sll.deleteFirst().data)\n" +
"    sll.display()");// code
area4.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
area4.setBackground(new Color(0xf7f7fb));
panel1d.add(lablld);
JScrollPane scrollPane4 = new JScrollPane(area4);
scrollPane4.setPreferredSize(new Dimension(450,450));
scrollPane4.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
scrollPane4.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}});
scrollPane4.setVerticalScrollBarPolicy
(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        




                //6- student Shahad
JFrame Shahadf = new JFrame();//create a Frame
Shahadf.setTitle("Shahad"); //titel of frame
Shahadf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
Shahadf.setLayout(null);
Shahadf.setSize(650 ,650); //size x-dimension , y-dimensiob
Shahadf.getContentPane().setBackground(new Color(0xddb7ab));//set color of backgrond.
JPanel panel1s = new JPanel();
panel1s.setBounds(35, 45, 550, 510);
panel1s.setBackground(new Color(0xf4eeed));
JLabel lablls = new JLabel(); //create Label
lablls.setText(" The Transfer Code(C++) ");//Set text of label
lablls.setFont(new Font("MV boli",  Font.ITALIC,28)); //set font of text
lablls.setBounds(50, 100, 100, 100);
JTextArea area5 = new JTextArea();    
        // setting location of text area in frame  
area5.setPreferredSize(new Dimension(500,2100));
area5.setEditable(false);
area5.setLineWrap(true);
area5.setWrapStyleWord(true);
area5.setText("#include <iostream>\n" +
"#include <cstdlib>\n" +
"using namespace std;\n" +
"\n" +
"struct ListNode\n" +
"{\n" +
"\n" +
"    int data;\n" +
"\n" +
"    struct ListNode *next;\n" +
"\n" +
"};\n" +
"\n" +
"struct ListNode* head = NULL;\n" +
"\n" +
"void insertFirst(int new_data)\n" +
"{\n" +
"\n" +
"    struct ListNode* new_node = (struct ListNode*) malloc(sizeof(struct ListNode));\n" +
"\n" +
"    new_node->data = new_data;\n" +
"\n" +
"    new_node->next = head;\n" +
"\n" +
"    head = new_node;\n" +
"\n" +
"}\n" +
"\n" +
"void display()\n" +
"{\n" +
"\n" +
"    struct ListNode* ptr;\n" +
"\n" +
"    ptr = head;\n" +
"\n" +
"    while (ptr != NULL)\n" +
"    {\n" +
"\n" +
"        cout<< ptr->data <<\" --> \";\n" +
"\n" +
"        ptr = ptr->next;\n" +
"\n" +
"    }\n" +
"\n" +
"\n" +
"\n" +
"    cout << \"null\" ;\n" +
"\n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"struct ListNode* deleteFirst()\n" +
"{\n" +
"\n" +
"    if  (head == NULL)\n" +
"    {\n" +
"\n" +
"        cout <<\"empty list\"<<endl ;\n" +
"        return NULL ;\n" +
"\n" +
"    }\n" +
"    else\n" +
"    {\n" +
"        struct ListNode* temp = head;\n" +
"\n" +
"        head = head->next;\n" +
"\n" +
"        temp->next = NULL;\n" +
"\n" +
"        return temp;\n" +
"\n" +
"\n" +
"    }\n" +
"\n" +
"}\n" +
"\n" +
"int main()\n" +
"{\n" +
"\n" +
"    insertFirst(5);\n" +
"\n" +
"    insertFirst(7);\n" +
"\n" +
"    deleteFirst();\n" +
"\n" +
"    cout << deleteFirst()->data << endl ;\n" +
"\n" +
"    display();\n" +
"\n" +
"    return 0;\n" +
"\n" +
"}");// code
area5.setFont(new Font("Inherited", Font.CENTER_BASELINE,16));
area5.setBackground(new Color(0xf7f7fb));
panel1s.add(lablls);
JScrollPane scrollPane5 = new JScrollPane(area5);
scrollPane5.setPreferredSize(new Dimension(450,450));
scrollPane5.getVerticalScrollBar().setBackground(new Color(0xf4eeed));
scrollPane5.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
    
    
    
    
protected void configureScrollBarColors() {
this.thumbColor = new Color(0xdece6ef);}});
scrollPane5.setVerticalScrollBarPolicy
(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);






               //1- student jumanah button
        
jumanah.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){      
jumanahf.setVisible(true);// make frame visibale.
//jumanahf.add(area);
jumanahf.add(panelJ);
panelJ.add(scrollPane);}}); 

               //2- student Maha button
               
maha.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){         
Mahaf.setVisible(true);// make frame visibale.

Mahaf.add(panel1M);
panel1M.add(scrollPane1);}}); 
         
              //3- student Roaa button
              
Roaa.addActionListener(new ActionListener(){   
public void actionPerformed(ActionEvent e){        
Roaaf.setVisible(true);// make frame visibale.
Roaaf.add(panel1R);
panel1R.add(scrollPane2);}});
        
              //4- student Amjad button
              
Amjad.addActionListener(new ActionListener(){    
public void actionPerformed(ActionEvent e){           
Amjadf.setVisible(true);// make frame visibale.
 
Amjadf.add(panel1A);
panel1A.add(scrollPane3);}});
                    
             //5- student Dana button
             
Dana.addActionListener(new ActionListener(){   
public void actionPerformed(ActionEvent e){         
Danaf.setVisible(true);// make frame visibale.
 
Danaf.add(panel1d);
panel1d.add(scrollPane4);}});
        
             //6- student Shahad button
             
Shahad.addActionListener(new ActionListener(){   
public void actionPerformed(ActionEvent e){          
Shahadf.setVisible(true);// make frame visibale.
 
Shahadf.add(panel1s);
panel1s.add(scrollPane5);}});}}
   