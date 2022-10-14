package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.LibraryMember;

/**
 * Author: Kuylim TITH
 * Date: 10/14/2022
 */
public interface MemberRepository {
    LibraryMember add(LibraryMember member);
}
