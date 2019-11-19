import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {   
        pool = new ArrayList<Movie>();
        for( int x=0;x<=pool.size()-1;x++)
            {
             pool.add(movies[x]);
            }
    }
    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList <Movie> list=new ArrayList <Movie> ();
        for (int x=0;x<=pool.size()-1;x++)
                {
                    if(pool.get(x).getStudio().equals(studio))
                            {
                                list.add(pool.get(x));
                            }
                }
        return list;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie answer=movies.get(0);
        for (int x=0;x<=movies.size()-1;x++)
                {
                   if(movies.get(x).getRating()>answer.getRating())
                        {
                            answer=movies.get(x);
                        }
                }
        return answer;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        for(int x=0;x<=pool.size()-1;x++)
                {
                    highestRated.add(getHighestrating(getByStudio("Disney")));
                    highestRated.add(getHighestrating(getByStudio("Ghibli")));
                    highestRated.add(getHighestrating(getByStudio("Indy")));
                }
        return highestRated;
    }

}
