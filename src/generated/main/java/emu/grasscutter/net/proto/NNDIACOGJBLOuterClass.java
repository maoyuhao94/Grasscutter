// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NNDIACOGJBL.proto

public final class NNDIACOGJBLOuterClass {
  private NNDIACOGJBLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code NNDIACOGJBL}
   */
  public enum NNDIACOGJBL
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NNDIACOGJBL_NONE = 0;</code>
     */
    NNDIACOGJBL_NONE(0),
    /**
     * <code>BLKJCONMCCO = 1;</code>
     */
    BLKJCONMCCO(1),
    /**
     * <code>CIADBIJEAMK = 2;</code>
     */
    CIADBIJEAMK(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NNDIACOGJBL_NONE = 0;</code>
     */
    public static final int NNDIACOGJBL_NONE_VALUE = 0;
    /**
     * <code>BLKJCONMCCO = 1;</code>
     */
    public static final int BLKJCONMCCO_VALUE = 1;
    /**
     * <code>CIADBIJEAMK = 2;</code>
     */
    public static final int CIADBIJEAMK_VALUE = 2;


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
    public static NNDIACOGJBL valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NNDIACOGJBL forNumber(int value) {
      switch (value) {
        case 0: return NNDIACOGJBL_NONE;
        case 1: return BLKJCONMCCO;
        case 2: return CIADBIJEAMK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NNDIACOGJBL>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NNDIACOGJBL> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NNDIACOGJBL>() {
            public NNDIACOGJBL findValueByNumber(int number) {
              return NNDIACOGJBL.forNumber(number);
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
      return NNDIACOGJBLOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final NNDIACOGJBL[] VALUES = values();

    public static NNDIACOGJBL valueOf(
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

    private NNDIACOGJBL(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:NNDIACOGJBL)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NNDIACOGJBL.proto*E\n\013NNDIACOGJBL\022\024\n\020NN" +
      "DIACOGJBL_NONE\020\000\022\017\n\013BLKJCONMCCO\020\001\022\017\n\013CIA" +
      "DBIJEAMK\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
