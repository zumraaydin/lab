1) why can't we rely on CPU execution time to measure algorithm efficiency?

We can’t rely on CPU execution time to measure an algorithm’s efficiency because execution time depends on many external factors, not just the algorithm itself. That means there are some reasons . Firstly  hardware 
depence. While execution time depends heavily on the machine running the program : CPU model and clock speed (e.g., Intel i9 vs. AMD Ryzen) , Cache size, memory speed, and architecture ,Whether the system is 
32-bit or 64-bit. Secondly, Input Size and Characteristics. Time depends on input size (n) and even the specific input values ,Best-case, average-case, and worst-case inputs can all differ.We need a general way to 
describe how time grows as n increases. and other reasons are Software & System Load.Those mean; Operating system (Windows, macOS, Linux),Background processes and system load ,Compiler or interpreter optimizations
Programming language implementation (e.g., C vs. Python).

2) How many operations does this code execute ?
int sum = 0;
sum = sum +5;

1+1=Q(1)

3) Give the final time complexity of the code
   
a) int sum =0;
   for (int i = 0; i<n; i++){           ------>  Each iteration = O(1),  Number of iterations = n , Total = n × O(1) = O(n)
   sum+=i;
   }

  c) int n = 1024;                                                   Both run once → O(1)
     int count = 0;
       while (n>1){                                                   The loop runs as long as n > 1., So per iteration: O(1),
         n= n/2;                                    ------------>      Number of iterations ≈ log₂(n)
       count++;                                                        O(logn)​
      System.out.println("n="+n);
   }
System.out.println("total divisions"+ count);


b) int sum =0;

  for (int i =0; i <n; i++){                        -----------> Outer loop: runs n times
     for (int j=0; j>n; j++){                                     Inner loop: runs n times per outer iteration
  sum += i+ j;                                                    Total operations = n × n = n²
  }}                                                              O(n2)​
                                                              
