package pulse.settings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModeSetting extends Setting<Integer> {
   private final String[] values;
   private final boolean multiSelect;
   private final Set<Integer> selectedIndices;

   public ModeSetting(String name, String description, String[] values, int value) {
      super(name, description, clampIndex(values, value));
      this.values = values;
      this.multiSelect = false;
      this.selectedIndices = new HashSet<>();
   }

   public ModeSetting(String name, String[] values, int value) {
      this(name, "", values, value);
   }

   public ModeSetting(String name, String[] values, String value) {
      this(name, "", values, indexOf(values, value));
   }

   public ModeSetting(String name, String description, String[] values, int[] selected) {
      super(name, description, firstSelectedIndex(values, selected));
      this.values = values;
      this.multiSelect = true;
      this.selectedIndices = new HashSet<>();
      for (int index : selected) {
         if (isValidIndex(values, index)) {
            this.selectedIndices.add(index);
         }
      }
   }

   public ModeSetting(String name, String[] values, int[] selected) {
      this(name, "", values, selected);
   }

   public String[] values() {
      return this.values;
   }

   public List<String> valueList() {
      return Arrays.asList(this.values);
   }

   public boolean isMultiSelect() {
      return this.multiSelect;
   }

   public String selectedValue() {
      int index = this.k();
      return isValidIndex(this.values, index) ? this.values[index] : "";
   }

   public void select(String value) {
      this.select(indexOf(this.values, value));
   }

   public Set<Integer> selectedIndices() {
      Set<Integer> selected = new HashSet<>(this.selectedIndices);
      if (!this.multiSelect) {
         selected.add(this.k());
      }
      return selected;
   }

   public boolean isSelected(int index) {
      return this.multiSelect ? this.selectedIndices.contains(index) : this.k() == index;
   }

   public void select(int index) {
      if (this.multiSelect) {
         if (this.selectedIndices.contains(index)) {
            this.selectedIndices.remove(index);
         } else if (isValidIndex(this.values, index)) {
            this.selectedIndices.add(index);
         }
      } else {
         super.a(clampIndex(this.values, index));
      }
   }

   public void setSelectedIndices(Set<Integer> selected) {
      this.selectedIndices.clear();
      for (int index : selected) {
         if (isValidIndex(this.values, index)) {
            this.selectedIndices.add(index);
         }
      }
   }

   public boolean isSelected(String value) {
      return this.multiSelect ? this.selectedIndices.contains(indexOf(this.values, value)) : this.selectedValue().equals(value);
   }

   public ModeSetting visibleWhen(Supplier<Boolean> condition) {
      super.visibleWhen(condition);
      return this;
   }

   private static int indexOf(String[] values, String value) {
      for (int index = 0; index < values.length; index++) {
         if (values[index].equals(value)) {
            return index;
         }
      }
      return 0;
   }

   private static int firstSelectedIndex(String[] values, int[] selected) {
      return selected.length > 0 ? clampIndex(values, selected[0]) : 0;
   }

   private static int clampIndex(String[] values, int index) {
      if (values.length == 0) {
         return 0;
      }
      return Math.max(0, Math.min(index, values.length - 1));
   }

   private static boolean isValidIndex(String[] values, int index) {
      return index >= 0 && index < values.length;
   }

   public String[] a() {
      return this.values();
   }

   public List<String> b() {
      return this.valueList();
   }

   public boolean c() {
      return this.isMultiSelect();
   }

   public String d() {
      return this.selectedValue();
   }

   public void a(String value) {
      this.select(value);
   }

   public Set<Integer> e() {
      return this.selectedIndices();
   }

   public boolean a(int index) {
      return this.isSelected(index);
   }

   public void b(int index) {
      this.select(index);
   }

   public void a(Set<Integer> selected) {
      this.setSelectedIndices(selected);
   }

   public boolean b(String value) {
      return this.isSelected(value);
   }

   public boolean c(int index) {
      return this.isSelected(index);
   }

   public boolean c(String value) {
      return this.selectedIndices.contains(indexOf(this.values, value));
   }

   public ModeSetting a(Supplier<Boolean> condition) {
      return this.visibleWhen(condition);
   }
}
