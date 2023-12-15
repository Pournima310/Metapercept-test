public class LongestWordfinder {
    public static void main(sting[]args){
        string input1="dummy text of the printing and typesetting industry.";
        string output1=findlongestWord(input1);
        system.out.println("Input:\""+ input+"\"");
        system.out.println("output:"+output1);
        
        String input2="It is a long-established fact that a reader will be distracted by the readable content of"+
        "a page when looking at its layout. The point of using Lorem Ipsum is that it has a"+
        "more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using "+
        "'Content here', making it look like readable English”;
        string output2 =findLongestWord(input2);
        system.out.println("\nInput:\""+input2+"\"");
        System.out.println("output:"+ output2);
    } 
    private static string findlongestWord(String input){
        string[]words =input.split("\\s+");
        string longestWord=""; 

        for (string word:words){ 
            string cleanword =word.replaceAll("[^a-zA-Z]","");

            if(cleanword.length()>LongestWord.length()) { 
            }
        }
        return longestWord;
    }
}



