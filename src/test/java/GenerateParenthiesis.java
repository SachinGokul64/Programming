import io.netty.handler.ipfilter.AbstractRemoteAddressFilter;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthiesis {



        public static void main(String[] args)
        {
           List<String> ouput =  generateParenthesis(3);
           System.out.println(ouput);
        }
        public static List<String> generateParenthesis(int n) {

            List<String> output_array = new ArrayList<>();
            backtracking(output_array,"",0,0,n);
            return output_array;
        }


        public static void backtracking(List<String> output_array, String current_string, int open, int close, int max)
        {
            if(max*2==current_string.length())
            {
                output_array.add(current_string);
                return;
            }

            if(open<max){
                backtracking(output_array,current_string+"(",open+1,close,max);

            }
            if (close<open)
            {
                backtracking(output_array,current_string+")",open,close+1,max);
            }
        }


}
