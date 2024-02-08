//Javadocs: Method Tags For Generating java Documentation
//        JavaDoc tags :
//        Tag	    Syntax
//        Description
//
//@author	@author name-text	Describes the author of a class.
//@version	@version version-number	Adds a "Version" heading which specifies the current version of the release or file.
//@since	@since release-date	Adds a "Since" heading that tells about the release date.
//@see	@see <a href="reference"></a>	Adds a "See Also" heading that refers to the other element of the documentation.
//        @return	@return return-description	Adds a "Return" description that tells about the return value of the method.
//@param	@param param-description	Provides the information about the method parameters in the "Parameters" section.
//        @throws	@exception exception-name description	Displays the exception that can be thrown by a method ( same as @exception)
//        {@code}	{@code text}	Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.
//@deprecated	@deprecated deprecatedtext	Adds a "Deprecated" heading indicating that this API should no longer be used.


package com.satyam_java;


/**
 * This is a good class
 */
public class sat_107_method_tags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c= i+ j;
        return c;
    }
}

