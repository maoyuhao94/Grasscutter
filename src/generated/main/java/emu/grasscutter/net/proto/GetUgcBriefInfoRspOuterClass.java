// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcBriefInfoRsp.proto

public final class GetUgcBriefInfoRspOuterClass {
  private GetUgcBriefInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcBriefInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcBriefInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugcGuid = 15;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>.UgcType ugcType = 9;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugcType = 9;</code>
     * @return The ugcType.
     */
    UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    boolean hasMusicBriefInfo();
    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     * @return The musicBriefInfo.
     */
    MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo();
    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     */
    MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();

    public GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.ODGCKIFHHNPCase getODGCKIFHHNPCase();
  }
  /**
   * Protobuf type {@code GetUgcBriefInfoRsp}
   */
  public static final class GetUgcBriefInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcBriefInfoRsp)
      GetUgcBriefInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcBriefInfoRsp.newBuilder() to construct.
    private GetUgcBriefInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcBriefInfoRsp() {
      ugcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcBriefInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetUgcBriefInfoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 66: {
              MusicBriefInfoOuterClass.MusicBriefInfo.Builder subBuilder = null;
              if (oDGCKIFHHNPCase_ == 8) {
                subBuilder = ((MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_).toBuilder();
              }
              oDGCKIFHHNP_ =
                  input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_);
                oDGCKIFHHNP_ = subBuilder.buildPartial();
              }
              oDGCKIFHHNPCase_ = 8;
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              ugcType_ = rawValue;
              break;
            }
            case 120: {

              ugcGuid_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GetUgcBriefInfoRsp.FEOCBIBAOAK}
     */
    public enum FEOCBIBAOAK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 6341;</code>
       */
      PEPPOHPHJOJ(1, 6341),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FEOCBIBAOAK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 6341;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 6341;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static FEOCBIBAOAK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FEOCBIBAOAK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 6341: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FEOCBIBAOAK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FEOCBIBAOAK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FEOCBIBAOAK>() {
              public FEOCBIBAOAK findValueByNumber(int number) {
                return FEOCBIBAOAK.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final FEOCBIBAOAK[] VALUES = getStaticValuesArray();
      private static FEOCBIBAOAK[] getStaticValuesArray() {
        return new FEOCBIBAOAK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FEOCBIBAOAK valueOf(
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

      private final int index;
      private final int value;

      private FEOCBIBAOAK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GetUgcBriefInfoRsp.FEOCBIBAOAK)
    }

    private int oDGCKIFHHNPCase_ = 0;
    private java.lang.Object oDGCKIFHHNP_;
    public enum ODGCKIFHHNPCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      MUSIC_BRIEF_INFO(8),
      ODGCKIFHHNP_NOT_SET(0);
      private final int value;
      private ODGCKIFHHNPCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ODGCKIFHHNPCase valueOf(int value) {
        return forNumber(value);
      }

      public static ODGCKIFHHNPCase forNumber(int value) {
        switch (value) {
          case 8: return MUSIC_BRIEF_INFO;
          case 0: return ODGCKIFHHNP_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ODGCKIFHHNPCase
    getODGCKIFHHNPCase() {
      return ODGCKIFHHNPCase.forNumber(
          oDGCKIFHHNPCase_);
    }

    public static final int UGCGUID_FIELD_NUMBER = 15;
    private long ugcGuid_;
    /**
     * <code>uint64 ugcGuid = 15;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int UGCTYPE_FIELD_NUMBER = 9;
    private int ugcType_;
    /**
     * <code>.UgcType ugcType = 9;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugcType = 9;</code>
     * @return The ugcType.
     */
    @java.lang.Override public UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      UgcTypeOuterClass.UgcType result = UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 8;
    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasMusicBriefInfo() {
      return oDGCKIFHHNPCase_ == 8;
    }
    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     * @return The musicBriefInfo.
     */
    @java.lang.Override
    public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
      if (oDGCKIFHHNPCase_ == 8) {
         return (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_;
      }
      return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
    }
    /**
     * <code>.MusicBriefInfo music_brief_info = 8;</code>
     */
    @java.lang.Override
    public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
      if (oDGCKIFHHNPCase_ == 8) {
         return (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_;
      }
      return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (oDGCKIFHHNPCase_ == 8) {
        output.writeMessage(8, (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_);
      }
      if (ugcType_ != UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(9, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(15, ugcGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (oDGCKIFHHNPCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_);
      }
      if (ugcType_ != UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, ugcGuid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)) {
        return super.equals(obj);
      }
      GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other = (GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (ugcType_ != other.ugcType_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getODGCKIFHHNPCase().equals(other.getODGCKIFHHNPCase())) return false;
      switch (oDGCKIFHHNPCase_) {
        case 8:
          if (!getMusicBriefInfo()
              .equals(other.getMusicBriefInfo())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UGCGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + UGCTYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      switch (oDGCKIFHHNPCase_) {
        case 8:
          hash = (37 * hash) + MUSIC_BRIEF_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getMusicBriefInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GetUgcBriefInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcBriefInfoRsp)
        GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
      }

      // Construct using GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ugcGuid_ = 0L;

        ugcType_ = 0;

        retcode_ = 0;

        oDGCKIFHHNPCase_ = 0;
        oDGCKIFHHNP_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      public GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
        return GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp build() {
        GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp buildPartial() {
        GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = new GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp(this);
        result.ugcGuid_ = ugcGuid_;
        result.ugcType_ = ugcType_;
        result.retcode_ = retcode_;
        if (oDGCKIFHHNPCase_ == 8) {
          if (musicBriefInfoBuilder_ == null) {
            result.oDGCKIFHHNP_ = oDGCKIFHHNP_;
          } else {
            result.oDGCKIFHHNP_ = musicBriefInfoBuilder_.build();
          }
        }
        result.oDGCKIFHHNPCase_ = oDGCKIFHHNPCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) {
          return mergeFrom((GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other) {
        if (other == GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        switch (other.getODGCKIFHHNPCase()) {
          case MUSIC_BRIEF_INFO: {
            mergeMusicBriefInfo(other.getMusicBriefInfo());
            break;
          }
          case ODGCKIFHHNP_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int oDGCKIFHHNPCase_ = 0;
      private java.lang.Object oDGCKIFHHNP_;
      public ODGCKIFHHNPCase
          getODGCKIFHHNPCase() {
        return ODGCKIFHHNPCase.forNumber(
            oDGCKIFHHNPCase_);
      }

      public Builder clearODGCKIFHHNP() {
        oDGCKIFHHNPCase_ = 0;
        oDGCKIFHHNP_ = null;
        onChanged();
        return this;
      }


      private long ugcGuid_ ;
      /**
       * <code>uint64 ugcGuid = 15;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugcGuid = 15;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugcGuid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugcType = 9;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugcType = 9;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugcType = 9;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        UgcTypeOuterClass.UgcType result = UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugcType = 9;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugcType = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       * @return Whether the musicBriefInfo field is set.
       */
      @java.lang.Override
      public boolean hasMusicBriefInfo() {
        return oDGCKIFHHNPCase_ == 8;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       * @return The musicBriefInfo.
       */
      @java.lang.Override
      public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (oDGCKIFHHNPCase_ == 8) {
            return (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_;
          }
          return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        } else {
          if (oDGCKIFHHNPCase_ == 8) {
            return musicBriefInfoBuilder_.getMessage();
          }
          return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      public Builder setMusicBriefInfo(MusicBriefInfoOuterClass.MusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oDGCKIFHHNP_ = value;
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(value);
        }
        oDGCKIFHHNPCase_ = 8;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      public Builder setMusicBriefInfo(
          MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
        if (musicBriefInfoBuilder_ == null) {
          oDGCKIFHHNP_ = builderForValue.build();
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(builderForValue.build());
        }
        oDGCKIFHHNPCase_ = 8;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      public Builder mergeMusicBriefInfo(MusicBriefInfoOuterClass.MusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (oDGCKIFHHNPCase_ == 8 &&
              oDGCKIFHHNP_ != MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance()) {
            oDGCKIFHHNP_ = MusicBriefInfoOuterClass.MusicBriefInfo.newBuilder((MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_)
                .mergeFrom(value).buildPartial();
          } else {
            oDGCKIFHHNP_ = value;
          }
          onChanged();
        } else {
          if (oDGCKIFHHNPCase_ == 8) {
            musicBriefInfoBuilder_.mergeFrom(value);
          }
          musicBriefInfoBuilder_.setMessage(value);
        }
        oDGCKIFHHNPCase_ = 8;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      public Builder clearMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (oDGCKIFHHNPCase_ == 8) {
            oDGCKIFHHNPCase_ = 0;
            oDGCKIFHHNP_ = null;
            onChanged();
          }
        } else {
          if (oDGCKIFHHNPCase_ == 8) {
            oDGCKIFHHNPCase_ = 0;
            oDGCKIFHHNP_ = null;
          }
          musicBriefInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      public MusicBriefInfoOuterClass.MusicBriefInfo.Builder getMusicBriefInfoBuilder() {
        return getMusicBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      @java.lang.Override
      public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
        if ((oDGCKIFHHNPCase_ == 8) && (musicBriefInfoBuilder_ != null)) {
          return musicBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          if (oDGCKIFHHNPCase_ == 8) {
            return (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_;
          }
          return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> 
          getMusicBriefInfoFieldBuilder() {
        if (musicBriefInfoBuilder_ == null) {
          if (!(oDGCKIFHHNPCase_ == 8)) {
            oDGCKIFHHNP_ = MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
          }
          musicBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>(
                  (MusicBriefInfoOuterClass.MusicBriefInfo) oDGCKIFHHNP_,
                  getParentForChildren(),
                  isClean());
          oDGCKIFHHNP_ = null;
        }
        oDGCKIFHHNPCase_ = 8;
        onChanged();;
        return musicBriefInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetUgcBriefInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetUgcBriefInfoRsp)
    private static final GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp();
    }

    public static GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcBriefInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcBriefInfoRsp>() {
      @java.lang.Override
      public GetUgcBriefInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetUgcBriefInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetUgcBriefInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcBriefInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcBriefInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcBriefInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetUgcBriefInfoRsp.proto\032\rUgcType.prot" +
      "o\032\024MusicBriefInfo.proto\"\336\001\n\022GetUgcBriefI" +
      "nfoRsp\022\017\n\007ugcGuid\030\017 \001(\004\022\031\n\007ugcType\030\t \001(\016" +
      "2\010.UgcType\022\017\n\007retcode\030\001 \001(\005\022+\n\020music_bri" +
      "ef_info\030\010 \001(\0132\017.MusicBriefInfoH\000\"O\n\013FEOC" +
      "BIBAOAK\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\3051\022\017\n\013D" +
      "CDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\r\n\013ODG" +
      "CKIFHHNPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          UgcTypeOuterClass.getDescriptor(),
          MusicBriefInfoOuterClass.getDescriptor(),
        });
    internal_static_GetUgcBriefInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcBriefInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcBriefInfoRsp_descriptor,
        new java.lang.String[] { "UgcGuid", "UgcType", "Retcode", "MusicBriefInfo", "ODGCKIFHHNP", });
    UgcTypeOuterClass.getDescriptor();
    MusicBriefInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
