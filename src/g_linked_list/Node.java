package g_linked_list;

//create structure of the node
public class Node<T>{
	//node has two things data and address of the next node
	//data
	T data;
	//address of the next node is also the node 
	Node<T> next;
	
	//constructor to initialize the node data at the time of creation
	Node(T data){
		this.data = data;
//		next = null; // this line is not required though because default value of something which is not initialized in constructor is null
	}
}