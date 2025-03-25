package task_03;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<NotebookPart> parts = new ArrayList<NotebookPart>();
	
    public void fillPartsFromConsole() {
    	ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
        for (int i = 0; i < 3; i++) {
            parts.add(readDataFromConsoleObj.readDataFromConsole());}
    }
    
    public void printAllParts() {
        for (NotebookPart part : parts) {
            System.out.println(part);}
    }
    
    public void getLeastExpensivePart() {
    	int minPrice = parts.get(0).getNetPrice();
        for (NotebookPart part : parts) {
            if(part.getNetPrice() < minPrice) {
                minPrice = part.getNetPrice();
            }
        }
        for (NotebookPart part : parts) {
			if (part.getNetPrice() == minPrice) {
				System.out.println("A legolcsóbb alkatrész: ");
				System.out.println(part.toString());
			}
		};
    }

}
