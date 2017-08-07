package com.dynamic.creator;

import com.dynamic.common.FileUtils;
import org.springframework.stereotype.Service;

/**
 * Created by nuhma on 2017-07-03.
 */
@Service
public class CreatorServiceImpl implements CreatorService {
    @Override
    public CreatorResponse createClass(CreateClassRequest createClassRequest) {

        /*ClassModel classModel = createClassRequest.getClassModel();
        List<String> imports = classModel.getImports();
        List<String> accessModifiers = classModel.getAccessModifiers();
        List<Variable> variables = classModel.getVariables();
        List<Constructor> constructors = classModel.getConstructors();
        List<Method> methods = classModel.getMethods();*/
        CreatorResponse creatorResponse = new CreatorResponse();

        /*String packageName = "package " + classModel.getPackages();
        String allImports = "\r\n";
        String allAccessModifiers = "";
        String name = classModel.getName();
        String allVariables = "\r\n";
        String allConstructors="";
        String allMethods = "";
        String content="";

        for (String imp : imports) {
            allImports += "import " + imp + ";\r\n";
        }

        for (String access : accessModifiers) {
            allAccessModifiers += " " + access;
        }

        for (Variable variable1 : variables) {
            allVariables += variable1+";\r\n";
        }

        for(Constructor constructor:constructors){
            allConstructors += constructor+"\r\n";
        }

        for(Method method:methods){
            allMethods += method+"\r\n";
        }
        content = packageName + allImports + allAccessModifiers + " " +name + "{\r\n" +allVariables +"\r\n" + allConstructors +"\r\n"+allMethods+"\r\n}";
        String filePath = createClassRequest.getLocation()+"\\"+name+".java";
        FileUtils.writeToFile(filePath, content);
        boolean isCreated = new File(filePath).isFile();
        creatorResponse.setCreated(isCreated);*/

        return creatorResponse;
    }

    public static void main(String[] args) {

        String testData = "Test Data\r\nTest line";
        FileUtils.writeToFile("E:\\workspace\\newbank\\dynamic\\src\\main\\java\\com\\newbank\\creator\\test.txt", testData);


    }
}
