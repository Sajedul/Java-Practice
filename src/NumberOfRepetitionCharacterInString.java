public class NumberOfRepetitionCharacterInString {
    public int countRepetition(String s,char c){
        char[]charArray= s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if (charArray[i]==c) {
                count++;
            }
        }
        return count;
    }

}
