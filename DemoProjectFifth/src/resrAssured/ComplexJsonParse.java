package resrAssured;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JsonPath js=new JsonPath(payLoad2.CoursePrice());
//Print no. of coursesreturned by API.
int count= js.getInt("courses.size()");
System.out.println(count);
	}


}
