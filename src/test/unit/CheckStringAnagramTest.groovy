import com.alphacoder.string.util.CheckStringAnagram
import spock.lang.Specification

class CheckStringAnagramTest extends Specification{

    def 'Test CheckStringAnagram | checkStringAnagrams() | s1 is null'(){
        given:
        def s1= null
        def s2= 'Care'

        when:
        def result= CheckStringAnagram.checkStringAnagrams(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | checkStringAnagrams() | s2 is null'(){
        given:
        def s1= 'Race'
        def s2= null

        when:
        def result= CheckStringAnagram.checkStringAnagrams(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | checkStringAnagrams() | s1 and s2 of different length'(){
        given:
        def s1= 'Race'
        def s2= 'Cares'

        when:
        def result= CheckStringAnagram.checkStringAnagrams(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | checkStringAnagrams() | s1 and s2 are anagrams'(){
        given:
        def s1= 'Race'
        def s2= 'Care'

        when:
        def result= CheckStringAnagram.checkStringAnagrams(s1, s2)

        then:
        result
    }

    def 'Test CheckStringAnagram | isAnagramCounting() | s1 is null'(){
        given:
        def s1= null
        def s2= 'Care'

        when:
        def result= CheckStringAnagram.isAnagramCounting(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | isAnagramCounting() | s2 is null'(){
        given:
        def s1= 'Race'
        def s2= null

        when:
        def result= CheckStringAnagram.isAnagramCounting(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | isAnagramCounting() | s1 and s2 of different length'(){
        given:
        def s1= 'Race'
        def s2= 'Cares'

        when:
        def result= CheckStringAnagram.isAnagramCounting(s1, s2)

        then:
        !result
    }

    def 'Test CheckStringAnagram | isAnagramCounting() | s1 and s2 are anagrams'(){
        given:
        def s1= 'Race'
        def s2= 'Care'

        when:
        def result= CheckStringAnagram.isAnagramCounting(s1, s2)

        then:
        result
    }
}
