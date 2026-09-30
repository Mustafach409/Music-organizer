import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    // question 3 ( rewrite)
    public void listFile(int index)
    {
        if(validIndex(index)){
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    // question 3 ( rewrite)
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    //question 1
    public void checkIndex(int index){
        if ( index >= 0 && index <= files.size()){
            
        }
        else{
            System.out.println("valid range is  range 0 to size()–1 (inclusive)"); 
        }
    }
    //question 2
    public boolean validIndex(int index){
        if ( index >= 0 && index <= files.size()){
            return true;
        }
        else {
            return false;
        }
}
//question 4
public void listAllFiles(){
    //void because it dosent return anything. only prints all the files. it does not need parameters
}
}