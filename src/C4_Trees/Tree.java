package C4_Trees;

/*
import java.util.LinkedList;
import java.util.Queue;

class node {
        int key;
        node left;
        node right;

        node(int k) {
            key = k;
            left = right = null;

        }

    }
    class  main{

        public static void main(String[] args) {
            node root = new node(10);
            root.left = new node(20);
            root.right = new node(30);
            root.left.left = new node(40);
            root.left.right=new node(50);
            root.right.left=new node(60);
            root.right.right=new node(70);

            System.out.println();
            System.out.println("INORDER");
            inOrder(root);

            System.out.println();
            System.out.println("PREORDER");
            preOrder(root);

            System.out.println();
            System.out.println("PostOrder");
            postOrder(root);



            System.out.println();
            System.out.println("Kth Distance element");
            kdistance(root,2);

            System.out.println();
            System.out.println("Level order traversal(Breath first search)");
            breathfirstsrearch(root);
            System.out.println();

            System.out.println();
            System.out.println("Left of binary tree Recursive sol ");
            LBT(root,1);

            System.out.println();
            System.out.println("Left of binary tree Iterative sol ");
            LBTI(root);

            System.out.println();
            System.out.println("Height of tree");
            System.out.println(height(root));;


            System.out.println();
            System.out.println("Size of the tree ");
            System.out.print(getsize(root)); ;

            System.out.println();
            System.out.println("Maximum in the node ");
            System.out.println(getmax(root));



        }



        static void inOrder(node root){
            if(root!=null){
                inOrder(root.left);
                System.out.println(root.key+" ");
                inOrder(root.right);
            }
        }

        static void preOrder(node root){
            if(root!=null){
                System.out.println(root.key+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        static void  postOrder(node root){
            if(root!=null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.println(root.key);
            }
        }

        static int  height(node root){
            if(root==null)
                return 0;
            else
                return (1+Math.max(height(root.left),height(root.right)));
        }

        static void kdistance(node root,int dis){
            if(root==null) return;
            if (dis==0){
                System.out.println(root.key+" ");
            }
            else {
                kdistance(root.left,dis-1);
                kdistance(root.right,dis-1);
            }
        }

        static void breathfirstsrearch(node root){
            if(root==null)return;
            Queue<node> q=new LinkedList<>();
            q.add(root);
            while(q.isEmpty()==false){
                node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }

        static int getsize(node root){
            if(root==null)
                return 0;
            else
                return 1+ getsize(root.left)+getsize(root.right);
        }

        static int getmax(node root){
            if(root==null){
                return Integer.MIN_VALUE;
            } else
              return
               Math.max(root.key, Math.max(getmax(root.left),getmax(root.right)));
        }

        static int maxlevel=0;
        static void LBT(node root ,int level){
            if (root==null)
                return;
            if (maxlevel<level){
                System.out.println(root.key+" ");
                maxlevel=level;
            }
            LBT(root.left,level+1);
            LBT(root.right,level+1);
        }

         static void LBTI(node root)  {
            if(root==null)
                return;

            Queue<node> q =new LinkedList<>();
            q.add(root);
            while(q.isEmpty()==false)
            {
                int count=q.size();

                for (int i=0;i<count;i++){
                    node curr=q.poll();

                    if (i==0)
                        System.out.println(curr.key+" ");
                    if (curr.left!=null)
                        q.add(curr.left);

                    if (curr.right!=null){
                        q.add(curr.right);
                    }

                }
            }
        }
   }

 */




