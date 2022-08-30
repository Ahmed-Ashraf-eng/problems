class Solution {
    public int romanToInt(String s) {
       char[] ch = s.toCharArray();
        int result = 0;
        for(int i = 0 ; i < ch.length ; i++){
            switch (ch[i]) {
              case 'I':
                if(i < ch.length -1){
                    if(ch[i+1] == 'V'){result += 4 ; i++; break;}
                    else if(ch[i+1] == 'X'){result += 9 ; i++; break;}
                    else{result += 1; break;}
                } 
                else result += 1;
                break;
              case 'V':
                result += 5;
                break;
              case 'X':
                if(i < ch.length -1){
                    if(ch[i+1] == 'L'){result += 40 ; i++; break;}
                    else if(ch[i+1] == 'C'){result += 90 ; i++; break;}
                    else{result += 10; break;}
                }
                else result += 10;
                break;
              case 'L':
                result += 50;
                break;
              case 'C':
                if(i < ch.length -1){
                    if(ch[i+1] == 'D'){result += 400 ; i++; break;}
                    if(ch[i+1] == 'M'){result += 900 ; i++; break;}
                    else{result += 100; break;}
                }
                else result += 100;    
                break;
              case 'D':
                result += 500;
                break;
              case 'M':
                result += 1000;
                break;
            }
        }
        return result;
    }
}