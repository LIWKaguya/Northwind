package fi.vamk.e1900315.nortrhwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sales_reports {
   @Id
   String group_by, display, title, filter_row_source;
   int defaults;

    public int getDefaults() {
        return this.defaults;
    }

    public void setDefaults(int defaults) {
        this.defaults = defaults;
    }

    public String getGroup_by() {
        return this.group_by;
    }

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilter_row_source() {
        return this.filter_row_source;
    }

    public void setFilter_row_source(String filter_row_source) {
        this.filter_row_source = filter_row_source;
    }

}
