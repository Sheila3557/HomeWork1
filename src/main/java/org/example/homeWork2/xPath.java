package org.example.homeWork2;public class xPath {
 public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
//to send the username in the text box
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("abracadabra");

//click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

// write the security question1
        WebElement sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("what is your mom's maiden name");

//get the text
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum')]"));
        System.out.println(text.getText());

//pas api setting
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("yellowribbon123");

// send email1
        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("selenium1@gmail.com");

//send email2
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("selenium2@gmail.com");

//send email 3
        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("selenium3@gmail.com");

//use of operators : field1
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("hello there");

//passing field2
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("goodbye then");

//last box, field1
        WebElement nextField1 = driver.findElement(By.xpath("(//input[@name='customField1'])[1]"));
        nextField1.sendKeys("good morning");

//field2
        WebElement nextField2 = driver.findElement(By.xpath("(//input[@name='customField1'])[2]"));
        nextField2.sendKeys("good evening");

    }
  
}
