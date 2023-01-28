// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCInviteRsp.proto

public final class GCGTCInviteRspOuterClass {
  private GCGTCInviteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCInviteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCInviteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool ibiikedgnhn = 3;</code>
     * @return The ibiikedgnhn.
     */
    boolean getIbiikedgnhn();

    /**
     * <code>uint32 elementType = 9;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 pointId = 15;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>bool retcode = 2;</code>
     * @return The retcode.
     */
    boolean getRetcode();

    /**
     * <code>uint32 caaaccpgkff = 5;</code>
     * @return The caaaccpgkff.
     */
    int getCaaaccpgkff();

    /**
     * <code>uint32 levelId = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 avatarId = 13;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code GCGTCInviteRsp}
   */
  public static final class GCGTCInviteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCInviteRsp)
      GCGTCInviteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCInviteRsp.newBuilder() to construct.
    private GCGTCInviteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCInviteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCInviteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCInviteRsp(
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
            case 16: {

              retcode_ = input.readBool();
              break;
            }
            case 24: {

              ibiikedgnhn_ = input.readBool();
              break;
            }
            case 40: {

              caaaccpgkff_ = input.readUInt32();
              break;
            }
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 72: {

              elementType_ = input.readUInt32();
              break;
            }
            case 104: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 120: {

              pointId_ = input.readUInt32();
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
      return GCGTCInviteRspOuterClass.internal_static_GCGTCInviteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGTCInviteRspOuterClass.internal_static_GCGTCInviteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGTCInviteRspOuterClass.GCGTCInviteRsp.class, GCGTCInviteRspOuterClass.GCGTCInviteRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GCGTCInviteRsp.BJPECKHGPIC}
     */
    public enum BJPECKHGPIC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 7206;</code>
       */
      PEPPOHPHJOJ(1, 7206),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BJPECKHGPIC DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 7206;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 7206;
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
      public static BJPECKHGPIC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BJPECKHGPIC forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 7206: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BJPECKHGPIC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BJPECKHGPIC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BJPECKHGPIC>() {
              public BJPECKHGPIC findValueByNumber(int number) {
                return BJPECKHGPIC.forNumber(number);
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
        return GCGTCInviteRspOuterClass.GCGTCInviteRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final BJPECKHGPIC[] VALUES = getStaticValuesArray();
      private static BJPECKHGPIC[] getStaticValuesArray() {
        return new BJPECKHGPIC[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static BJPECKHGPIC valueOf(
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

      private BJPECKHGPIC(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GCGTCInviteRsp.BJPECKHGPIC)
    }

    public static final int IBIIKEDGNHN_FIELD_NUMBER = 3;
    private boolean ibiikedgnhn_;
    /**
     * <code>bool ibiikedgnhn = 3;</code>
     * @return The ibiikedgnhn.
     */
    @java.lang.Override
    public boolean getIbiikedgnhn() {
      return ibiikedgnhn_;
    }

    public static final int ELEMENTTYPE_FIELD_NUMBER = 9;
    private int elementType_;
    /**
     * <code>uint32 elementType = 9;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int POINTID_FIELD_NUMBER = 15;
    private int pointId_;
    /**
     * <code>uint32 pointId = 15;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private boolean retcode_;
    /**
     * <code>bool retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public boolean getRetcode() {
      return retcode_;
    }

    public static final int CAAACCPGKFF_FIELD_NUMBER = 5;
    private int caaaccpgkff_;
    /**
     * <code>uint32 caaaccpgkff = 5;</code>
     * @return The caaaccpgkff.
     */
    @java.lang.Override
    public int getCaaaccpgkff() {
      return caaaccpgkff_;
    }

    public static final int LEVELID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 levelId = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int AVATARID_FIELD_NUMBER = 13;
    private int avatarId_;
    /**
     * <code>uint32 avatarId = 13;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (retcode_ != false) {
        output.writeBool(2, retcode_);
      }
      if (ibiikedgnhn_ != false) {
        output.writeBool(3, ibiikedgnhn_);
      }
      if (caaaccpgkff_ != 0) {
        output.writeUInt32(5, caaaccpgkff_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(9, elementType_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(13, avatarId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(15, pointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, retcode_);
      }
      if (ibiikedgnhn_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, ibiikedgnhn_);
      }
      if (caaaccpgkff_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, caaaccpgkff_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, elementType_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, avatarId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, pointId_);
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
      if (!(obj instanceof GCGTCInviteRspOuterClass.GCGTCInviteRsp)) {
        return super.equals(obj);
      }
      GCGTCInviteRspOuterClass.GCGTCInviteRsp other = (GCGTCInviteRspOuterClass.GCGTCInviteRsp) obj;

      if (getIbiikedgnhn()
          != other.getIbiikedgnhn()) return false;
      if (getElementType()
          != other.getElementType()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCaaaccpgkff()
          != other.getCaaaccpgkff()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + IBIIKEDGNHN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIbiikedgnhn());
      hash = (37 * hash) + ELEMENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + POINTID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRetcode());
      hash = (37 * hash) + CAAACCPGKFF_FIELD_NUMBER;
      hash = (53 * hash) + getCaaaccpgkff();
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp parseFrom(
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
    public static Builder newBuilder(GCGTCInviteRspOuterClass.GCGTCInviteRsp prototype) {
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
     * Protobuf type {@code GCGTCInviteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCInviteRsp)
        GCGTCInviteRspOuterClass.GCGTCInviteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGTCInviteRspOuterClass.internal_static_GCGTCInviteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGTCInviteRspOuterClass.internal_static_GCGTCInviteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGTCInviteRspOuterClass.GCGTCInviteRsp.class, GCGTCInviteRspOuterClass.GCGTCInviteRsp.Builder.class);
      }

      // Construct using GCGTCInviteRspOuterClass.GCGTCInviteRsp.newBuilder()
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
        ibiikedgnhn_ = false;

        elementType_ = 0;

        pointId_ = 0;

        retcode_ = false;

        caaaccpgkff_ = 0;

        levelId_ = 0;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGTCInviteRspOuterClass.internal_static_GCGTCInviteRsp_descriptor;
      }

      @java.lang.Override
      public GCGTCInviteRspOuterClass.GCGTCInviteRsp getDefaultInstanceForType() {
        return GCGTCInviteRspOuterClass.GCGTCInviteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public GCGTCInviteRspOuterClass.GCGTCInviteRsp build() {
        GCGTCInviteRspOuterClass.GCGTCInviteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGTCInviteRspOuterClass.GCGTCInviteRsp buildPartial() {
        GCGTCInviteRspOuterClass.GCGTCInviteRsp result = new GCGTCInviteRspOuterClass.GCGTCInviteRsp(this);
        result.ibiikedgnhn_ = ibiikedgnhn_;
        result.elementType_ = elementType_;
        result.pointId_ = pointId_;
        result.retcode_ = retcode_;
        result.caaaccpgkff_ = caaaccpgkff_;
        result.levelId_ = levelId_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof GCGTCInviteRspOuterClass.GCGTCInviteRsp) {
          return mergeFrom((GCGTCInviteRspOuterClass.GCGTCInviteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGTCInviteRspOuterClass.GCGTCInviteRsp other) {
        if (other == GCGTCInviteRspOuterClass.GCGTCInviteRsp.getDefaultInstance()) return this;
        if (other.getIbiikedgnhn() != false) {
          setIbiikedgnhn(other.getIbiikedgnhn());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getRetcode() != false) {
          setRetcode(other.getRetcode());
        }
        if (other.getCaaaccpgkff() != 0) {
          setCaaaccpgkff(other.getCaaaccpgkff());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
        GCGTCInviteRspOuterClass.GCGTCInviteRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGTCInviteRspOuterClass.GCGTCInviteRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean ibiikedgnhn_ ;
      /**
       * <code>bool ibiikedgnhn = 3;</code>
       * @return The ibiikedgnhn.
       */
      @java.lang.Override
      public boolean getIbiikedgnhn() {
        return ibiikedgnhn_;
      }
      /**
       * <code>bool ibiikedgnhn = 3;</code>
       * @param value The ibiikedgnhn to set.
       * @return This builder for chaining.
       */
      public Builder setIbiikedgnhn(boolean value) {
        
        ibiikedgnhn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ibiikedgnhn = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIbiikedgnhn() {
        
        ibiikedgnhn_ = false;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 elementType = 9;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 elementType = 9;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 elementType = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 pointId = 15;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 pointId = 15;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pointId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private boolean retcode_ ;
      /**
       * <code>bool retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public boolean getRetcode() {
        return retcode_;
      }
      /**
       * <code>bool retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(boolean value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = false;
        onChanged();
        return this;
      }

      private int caaaccpgkff_ ;
      /**
       * <code>uint32 caaaccpgkff = 5;</code>
       * @return The caaaccpgkff.
       */
      @java.lang.Override
      public int getCaaaccpgkff() {
        return caaaccpgkff_;
      }
      /**
       * <code>uint32 caaaccpgkff = 5;</code>
       * @param value The caaaccpgkff to set.
       * @return This builder for chaining.
       */
      public Builder setCaaaccpgkff(int value) {
        
        caaaccpgkff_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 caaaccpgkff = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaaaccpgkff() {
        
        caaaccpgkff_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 13;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 13;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:GCGTCInviteRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGTCInviteRsp)
    private static final GCGTCInviteRspOuterClass.GCGTCInviteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGTCInviteRspOuterClass.GCGTCInviteRsp();
    }

    public static GCGTCInviteRspOuterClass.GCGTCInviteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCInviteRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCInviteRsp>() {
      @java.lang.Override
      public GCGTCInviteRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCInviteRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCInviteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCInviteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGTCInviteRspOuterClass.GCGTCInviteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCInviteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCInviteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GCGTCInviteRsp.proto\"\345\001\n\016GCGTCInviteRs" +
      "p\022\023\n\013ibiikedgnhn\030\003 \001(\010\022\023\n\013elementType\030\t " +
      "\001(\r\022\017\n\007pointId\030\017 \001(\r\022\017\n\007retcode\030\002 \001(\010\022\023\n" +
      "\013caaaccpgkff\030\005 \001(\r\022\017\n\007levelId\030\007 \001(\r\022\020\n\010a" +
      "vatarId\030\r \001(\r\"O\n\013BJPECKHGPIC\022\010\n\004NONE\020\000\022\020" +
      "\n\013PEPPOHPHJOJ\020\2468\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTCInviteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCInviteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCInviteRsp_descriptor,
        new java.lang.String[] { "Ibiikedgnhn", "ElementType", "PointId", "Retcode", "Caaaccpgkff", "LevelId", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
