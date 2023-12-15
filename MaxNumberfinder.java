import java.util.list;
public class MaxNumberfinder{
    public static int findMax(List<Object>array ){
        int max=Integer.MIN_VALUE;
        for(Object element:array){
            if(element instance of list){ 
                int maxInSubArray=findMax(List<Object>)element);
                max=Math.max(max,maxInSubArray); 
            } 
            else if (element instance Integer)
            {
                max=Math.Max(max,(Integer)element);
            }
            }
            return max;
        }
        public static void main(string[]args){
            List<Object>inputArray=List.Of(2,4,10,List.Of(12,4,List.Of(100,99),4List.Of(3,2,99),0);
            int result=findMax(inputArray);
            system.out.println("Maximum Number:"+result)
;
                }        }