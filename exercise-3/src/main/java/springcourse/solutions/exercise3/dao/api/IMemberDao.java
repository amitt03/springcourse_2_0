package springcourse.solutions.exercise3.dao.api;

import springcourse.solutions.exercise3.model.Member;

import java.util.Collection;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public interface IMemberDao {

    Member createMember(Member member);

    boolean memberExist(String memberId);

    Collection<Member> getAllMembers();

    void cancelMembership(String memberId);
}