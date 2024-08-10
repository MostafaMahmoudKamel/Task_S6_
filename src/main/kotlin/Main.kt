import kotlin.math.pow
fun main() {
    //Create an Array:
    //1: Declare an array of integers with the values [1, 2, 3, 4, 5].

    val integerArray = arrayOf(1, 2, 3, 4, 5)

    //2: Use a loop to iterate through the array and print each value using withIndex.
    for ((index, value) in integerArray.withIndex()) {
        println("index of [$index]= $value")
    }
    println()

    //3: Reverse the array and print the reversed array.
    val reversedIntegerArray = integerArray.reversedArray()
    println("reversed array is ${reversedIntegerArray.joinToString()}\n")

    //list
    //1: Declare an immutable list of strings with the values ["apple", "banana", "cherry"].
    val stringList = listOf("apple", "banana", "cherry")

    //2: Use a loop to iterate through the list and print each value using indices.
    for (index in stringList.indices) {
        println("stringList of index [$index]= ${stringList[index]}")
    }
    println()

    //3: Use the contains operator to check if the list contains the element "banana" and print the result.
    val containBanana = stringList.contains("banana")
    println("list contain banana = $containBanana \n")

    //4: Convert the list to uppercase and print the modified list.
    val upperStringList = stringList.map { it.uppercase() }
    println("modified list is = ${upperStringList.joinToString()}\n")


    //mutable list
    //1: Declare a mutable list of doubles with the values [1.1, 2.2, 3.3].
    val doubleList = mutableListOf(1.1, 2.2, 3.3)

    //2: Add the value 4.4 to the mutable list.
    doubleList.add(4.4)

    //3: Remove the value 2.2 from the mutable list.
    doubleList.remove(2.2)

    //4: Use a loop to iterate through the mutable list and print each value with for each.
    doubleList.forEach { println("mutableList item $it") }
    println()

    //5: Sort the mutable list in ascending order and print the sorted list
    doubleList.sort()
    println("sort in ascending$doubleList\n")


    //Use Operators and Loops:
    //1: Use the map operator to create a new list from the array where each value is multiplied by 2. Print the new list.
    val newList = integerArray.map { it * 2 }
    println("new list map *2 is ${newList}\n")

    //2: Use the filter operator to create a new list from the original list of strings that only contains strings with more than 5 characters. Print the new list.
    val newListFiltered = stringList.filter { it.length > 5 }
    println("new filtered list $newListFiltered\n")

    //3: Use the forEach loop to iterate through the modified mutable list of doubles and print each value squared.
    var modifiedDoubleList = doubleList.forEach { println(it.pow(2)) }
    println()


    //Utilize Additional Functions:
    //1: Use the none function to check if none of the elements in the array are negative. Print the result
    val none = integerArray.none { it < 0 }
    println("none result is $none \n ")

    //2: Use the all function to check if all the elements in the mutable list are greater than 1. Print the result
    val all = doubleList.all { it > 1 }
    println("Does the all result greater than 1 is = $all\n")

    //3: Use the find function to find the first element in the array that is greater than 3. Print the result. 
    val find = integerArray.find { it > 3 }
    println("found element greater that  3 = $find\n")

    //4: Use the filter function to create a new list from the array that contains only even numbers. Print the new list.
    val evenNumber = integerArray.filter { it % 2 == 0 }
    println("even list ${evenNumber}\n")

    /* 5: Use any function to check if there is any element in the list of strings that starts with 'a'. Print result */
    val any = stringList.any { it.startsWith('a') }
    println("There is any element start with a = $any")


}