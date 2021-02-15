package fi.mdeline.darksoulswiki.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Boss {
    private String name;
    private int health;
    private String location; // tän pitäis varmaan olla joku constant / pre-defined list
}
