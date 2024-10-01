package projectds;
/*
 @author team 7
 */
public class ProjectDS {
private static Integer []heapnum ;
private static String []heapname ;
public static int n  ;
static Integer bb=51;
public static ProjectDS Q=new ProjectDS(50);

public ProjectDS(int size){
heapnum = new Integer [size+1];
heapname = new String [size+1];
n=0;}

public static boolean isEmpty(){
return n==0;}

public int size(){
return n;}

public void insert(Integer x,String xx){
 n++;
heapnum[n]=x;
heapname[n]=xx;
swim(n);}

public static Integer num() {
return bb-=1 ;}
   
public void swim(int k){
while(k>1 && heapnum[k/2]<heapnum[k]){
int temp = heapnum [k];
heapnum[k]=heapnum[k/2];
heapnum[k/2]=temp;
k=k/2;}}

public void Dispaly(){
System.out.print("[");
for(int i=1;i<=n;i++){
System.out.println( "(" +heapnum[i] +"," +heapname[i]+")");}
System.out.print("]\n");}

public static String printname(int x){
String a = heapname[x] ;  
return a;}

public static Integer printnum(int x){
Integer aa = heapnum[x] ;  
return aa;}

public static int deleteMax(){
int max = heapnum[1];
swap(1,n);
n--;
sink(1);
heapnum[n+1]=0;
heapname[n+1]=null;
if (isEmpty()){
System.out.println ("heap is empty");}
if (n>0&&(n==(heapnum.length-1)/4)){
sort();
return max;}
return 0;}
   
private static void sink(int k){
while(2*k<=n){
int j = 2*k;
if (j<n&& heapnum[j]< heapnum[j+1])
{j++;}
if (heapnum[k]>= heapnum[j])
{break;}
swap(k,j);
k=j;}}
   
public static void swap (int a,int b){
Integer temp = heapnum[a];
String temp1 = heapname[a];
heapnum[a]=heapnum[b];
heapname[a]=heapname[b];
heapnum[b]=temp;
heapname[b]=temp1;}
 
public static void sort(){
int i;
int j;
for (i = 1; i < n; i++){  
for (j = i + 1; j < n; j++){  
int tmp ;  
if (heapnum[i] < heapnum[j]){  
swap(i,j);}}}}

public static void main(String[] args) {
Q.insert(num() ,"Sara Ahmad");
Q.insert(num() ,"Ali Abdualrahman");
Q.insert(num() ,"Mustafa omar");
Q.insert(num() ,"Leen Mohammad");
Q.insert(num() ,"Manar Abduallah");
Q.insert(num() ,"mossa waleed");
Q.insert(num() ,"Anas Alghamdi");
Q.insert(num() ,"Jennie Laous");
        
new frame() ;}}