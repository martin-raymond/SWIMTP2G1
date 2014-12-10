package database;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Scenario implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String description;

  @ManyToMany
  private ArrayList<Sequence> sequences;

  @ManyToOne
  private ArrayList<Result> results;

  private static final long serialVersionUID = 1L;
    private Object GenerationType;

  public Scenario() {
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

    public void setSequences(ArrayList<Sequence> sequences) {
        this.sequences = sequences;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public ArrayList<Sequence> getSequences() {
        return sequences;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

}