// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MPMJBKDBLNE.proto

public final class MPMJBKDBLNEOuterClass {
  private MPMJBKDBLNEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MPMJBKDBLNE}
   */
  public enum MPMJBKDBLNE
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KKAAJJMHHMJ = 0;</code>
     */
    KKAAJJMHHMJ(0),
    /**
     * <code>NOOJLHLJBLA = 1;</code>
     */
    NOOJLHLJBLA(1),
    /**
     * <code>PFOCJJJODLJ = 2;</code>
     */
    PFOCJJJODLJ(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>KKAAJJMHHMJ = 0;</code>
     */
    public static final int KKAAJJMHHMJ_VALUE = 0;
    /**
     * <code>NOOJLHLJBLA = 1;</code>
     */
    public static final int NOOJLHLJBLA_VALUE = 1;
    /**
     * <code>PFOCJJJODLJ = 2;</code>
     */
    public static final int PFOCJJJODLJ_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MPMJBKDBLNE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MPMJBKDBLNE forNumber(int value) {
      switch (value) {
        case 0: return KKAAJJMHHMJ;
        case 1: return NOOJLHLJBLA;
        case 2: return PFOCJJJODLJ;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MPMJBKDBLNE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MPMJBKDBLNE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MPMJBKDBLNE>() {
            public MPMJBKDBLNE findValueByNumber(int number) {
              return MPMJBKDBLNE.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MPMJBKDBLNEOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MPMJBKDBLNE[] VALUES = values();

    public static MPMJBKDBLNE valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MPMJBKDBLNE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MPMJBKDBLNE)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MPMJBKDBLNE.proto*@\n\013MPMJBKDBLNE\022\017\n\013KK" +
      "AAJJMHHMJ\020\000\022\017\n\013NOOJLHLJBLA\020\001\022\017\n\013PFOCJJJO" +
      "DLJ\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
