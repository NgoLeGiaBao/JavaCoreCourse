package annotation;
public class ExampleNMD extends superExampleNMD{
    @Override
    public void methodOverride() {
        System.out.println("SubClass Nguyen Minh Duc");
    }
/*    @Override
    public void methodOverrides() {
        System.out.println("SubClass Nguyen Minh Duc");
    }
	==> Phương thức này sẽ xảy ra lỗi, vì có từ khóa @Override tuy nhiên phương thức
	này không có trong phương thức cha, chính vì thế nó sẽ báo lỗi
 */
    public void methodOverrides() {
        System.out.println("SubClass Nguyen Minh Duc");
    }
   /*
    * Phương thức này sẽ không xảy ra lỗi, vì không có từ khóa @Override ở phía trước
    * chính vì vậy, nó được hiểu như là phương thức mà lớp con định nghĩa
    */
    
}
