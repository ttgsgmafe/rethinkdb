// Autogenerated by convert_protofile.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class InsertAt extends RqlQuery {


    public InsertAt(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public InsertAt(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public InsertAt(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INSERT_AT, args, optargs);
    }
    protected InsertAt(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static InsertAt fromArgs(Object... args){
        return new InsertAt(new Arguments(args), null);
    }


}