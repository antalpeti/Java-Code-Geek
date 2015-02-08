/**
 * <h1>Java Comparator Example</h1>
 *
 * <p>
 * In this example we will show how to use
 * <code>{@link java.util.Comparator java.util.Comparator}</code> interface.
 * <code>{@link java.util.Comparator java.util.Comparator}</code> is an interface which is used for
 * sorting objects in Java. The
 * <code>{@link java.util.Comparator#compare(Object, Object) compare(Object o1, Object o2)}</code>
 * method of <code>{@link java.util.Comparator Comparator}</code> interface needs to be implemented
 * for this purpose, which compares two objects and returns an integer, depending on the comparison:
 * positive, if o1 is greater than o2; zero, if o1 equals to o2; negative, if o1 is less than o2.
 * Another interface which is used for sorting objects is
 * <code>{@link java.lang.Comparable java.lang.Comparable}</code>. However,
 * <code>{@link java.lang.Comparable Comparable}</code> cannot sort objects on different attributes,
 * while <code>{@link java.util.Comparator Comparator}</code> can. Also, the method
 * <code>{@link java.lang.Comparable#compareTo(Object) compareTo(T o)}</code> of
 * <code>{@link java.lang.Comparable Comparable}</code> needs to be implemented in this case, which
 * compares the current object (<code>this</code> object) with the specified object for order. In
 * this example, we will pay attention to <code>{@link java.util.Comparator Comparator}</code>
 * interface.
 * </p>
 *
 * <h2>Example of using Comparator interface</h2>
 *
 * <p>
 * We need to use <code>{@link java.util.Comparator Comparator}</code> interface when we want to
 * order objects on different attributes, for example, let’s suppose that an employer would like to
 * order his employees by salary or by name. This cannot be done using
 * <code>{@link java.lang.Comparable Comparable}</code> interface.
 * </p>
 *
 * <p>
 * So, let’s see an example. First of all, let’s create the class that will represent the object
 * that will be sorted. Create a java class named
 * <code>{@link examples.comparator.Student Student}.java</code>.
 * </p>
 *
 * <p>
 * Now, let’s create two classes that will implement the
 * <code>{@link java.util.Comparator Comparator}</code> interface and they will be used so as to
 * sort students with different attributes. Firstly, create a java class named
 * <code>{@link examples.comparator.GradeComparator GradeComparator}.java</code>.
 * </p>
 *
 * <p>
 * Then, create a java class named
 * <code>{@link examples.comparator.NameComparator NameComparator}.java</code>.
 * </p>
 *
 * <p>
 * As we mentioned above, classes that implement the
 * <code>{@link java.util.Comparator Comparator}</code> interface need to override the
 * <code>{@link java.util.Comparator#compare(Object, Object) compare()}</code> method. In this
 * specific example, the sorting of grades will be in descending order as we have reversed the
 * objects o1, o2. For the comparison of names, we used the
 * <code>{@link java.lang.Comparable#compareTo(Object) int compareTo(String anotherString)}</code>
 * method.
 * </p>
 *
 * <p>
 * Finally, create a java class named
 * <code>{@link examples.comparator.MainComparatorExample MainComparatorExample}.java</code>, which
 * will be the main class of our example.
 * </p>
 *
 * <p>
 * We create an array of Students, three objects of type Student and then, we set the name and the
 * final grade for each one of them. After that, we print to the output the array without sorting,
 * then we sort the array (a) by grade and (b) by name, and finally, we print to the output the
 * respective results. The sorting can be done by using the method
 * <code>{@link java.util.Arrays#sort(Object[], java.util.Comparator) sort(T[] a, Comparator c)}</code>
 * of <code>{@link java.util.Arrays java.util.Arrays}</code>, which sorts the array of Students
 * according to the order induced by the specified comparator (either
 * <code>{@link examples.comparator.NameComparator NameComparator}</code> or
 * <code>{@link examples.comparator.GradeComparator GradeComparator}</code>, respectively).
 * </p>
 */
package examples.comparator;