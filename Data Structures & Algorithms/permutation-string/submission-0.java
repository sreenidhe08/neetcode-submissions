class Solution {
    public boolean checkInclusion(String s1, String s2) 
        {
               int[] qf= new int[26];
                      int[] w = new int[26];

                              if(s1.length() > s2.length())
                                  return false;
                                      
                                             for(int i=0;i<s1.length();i++)
                                                    {
                                                            qf[s1.charAt(i)-'a']++;
                                                                   } 

                                                                          for(int i=0;i<s1.length();i++)
                                                                                 {
                                                                                           w[s2.charAt(i)-'a']++;
                                                                                                  }
                                                                                                         if(Arrays.equals(qf,w))
                                                                                                                {
                                                                                                                        return true;
                                                                                                                               }
                                                                                                                                      for(int i=s1.length();i<s2.length();i++)
                                                                                                                                             {
                                                                                                                                                     w[s2.charAt(i-s1.length())-'a']--;
                                                                                                                                                             w[s2.charAt(i)-'a']++;
                                                                                                                                                                     if(Arrays.equals(qf,w))
                                                                                                                                                                            {
                                                                                                                                                                                    return true;
                                                                                                                                                                                           }

                                                                                                                                                                                                  }
                                                                                                                                                                                                         return false;
                                                                                                                                                                                                             }
                                                                                                                                                                                                             }
