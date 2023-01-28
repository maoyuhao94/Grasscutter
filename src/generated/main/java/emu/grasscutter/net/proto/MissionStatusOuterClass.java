// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MissionStatus.proto

public final class MissionStatusOuterClass {
  private MissionStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MissionStatus}
   */
  public enum MissionStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MISSION_STATUS_INVALID = 0;</code>
     */
    MISSION_STATUS_INVALID(0),
    /**
     * <code>MISSION_STATUS_UNFINISHED = 1;</code>
     */
    MISSION_STATUS_UNFINISHED(1),
    /**
     * <code>MISSION_STATUS_FINISHED = 2;</code>
     */
    MISSION_STATUS_FINISHED(2),
    /**
     * <code>MISSION_STATUS_POINT_TAKEN = 3;</code>
     */
    MISSION_STATUS_POINT_TAKEN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MISSION_STATUS_INVALID = 0;</code>
     */
    public static final int MISSION_STATUS_INVALID_VALUE = 0;
    /**
     * <code>MISSION_STATUS_UNFINISHED = 1;</code>
     */
    public static final int MISSION_STATUS_UNFINISHED_VALUE = 1;
    /**
     * <code>MISSION_STATUS_FINISHED = 2;</code>
     */
    public static final int MISSION_STATUS_FINISHED_VALUE = 2;
    /**
     * <code>MISSION_STATUS_POINT_TAKEN = 3;</code>
     */
    public static final int MISSION_STATUS_POINT_TAKEN_VALUE = 3;


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
    public static MissionStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MissionStatus forNumber(int value) {
      switch (value) {
        case 0: return MISSION_STATUS_INVALID;
        case 1: return MISSION_STATUS_UNFINISHED;
        case 2: return MISSION_STATUS_FINISHED;
        case 3: return MISSION_STATUS_POINT_TAKEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MissionStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MissionStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MissionStatus>() {
            public MissionStatus findValueByNumber(int number) {
              return MissionStatus.forNumber(number);
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
      return MissionStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MissionStatus[] VALUES = values();

    public static MissionStatus valueOf(
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

    private MissionStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MissionStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MissionStatus.proto*\207\001\n\rMissionStatus\022" +
      "\032\n\026MISSION_STATUS_INVALID\020\000\022\035\n\031MISSION_S" +
      "TATUS_UNFINISHED\020\001\022\033\n\027MISSION_STATUS_FIN" +
      "ISHED\020\002\022\036\n\032MISSION_STATUS_POINT_TAKEN\020\003b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
