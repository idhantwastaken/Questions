/*
                                          *                                      
                                          |      *                               
                                          |              *                       
                                          |                    *                 
                                          |                          *           
                                          |                               *      
                                          |                                  *   
                                          |                                    * 
                                          |                                    * 
                                          |                                    * 
                                          |                                 *    
                                          |                             *        
                                          |                        *             
                                          |                  *                   
                                          |            *                         
                                          |    *                                 
                                        * |                                      
                                *         |                                      
                         *                |                                      
                   *                      |                                      
              *                           |                                      
         *                                |                                      
      *                                   |                                      
     *                                    |                                      
     *                                    |                                      
      *                                   |                                      
         *                                |                                      
             *                            |                                      
                  *                       |                                      
                         *                |                                      
                                *         |                                      
                                       *  |                                      
                                          *                                      
*/
class SineGraph {
    public static void generateSine() {
        int scaledValue, fromColumn = 7, toColumn = 147, minima = -1, maxima = +1, midColumn;
        midColumn = (fromColumn + toColumn) / 2;
        char ch;
        for (float x = 0; x <= (float) 30 * Math.PI; x += 0.01) {
            scaledValue = (int) ((Math.sin(x) - minima) / (maxima - minima) * (toColumn - fromColumn) + fromColumn);
            // System.out.println("Angle "+x+", scaledValue "+scaledValue);
            for (int leadingSpace = 1; leadingSpace <= fromColumn; leadingSpace++) {
                System.out.print(" ");
            }
            for (int col = fromColumn; col <= toColumn; col++) {
                if (col == scaledValue)
                    ch = '*';
                else if (col == midColumn)
                    ch = '|';
                else{
                    if(scaledValue > midColumn && col > midColumn && col < scaledValue)
                        ch = '=';
                    else if(scaledValue < midColumn && col < midColumn && col > scaledValue)
                        ch = '=';
                    else
                        ch = ' ';
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generateSine();
    }
}