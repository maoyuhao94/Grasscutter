// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2BoatSettleNotify.proto

public final class SummerTimeV2BoatSettleNotifyOuterClass {
  private SummerTimeV2BoatSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeV2BoatSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeV2BoatSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     * @return The settleInfo.
     */
    SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getSettleInfo();
    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     */
    SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 stageId = 14;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 galleryId = 10;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>bool isNewRecord = 12;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * Protobuf type {@code SummerTimeV2BoatSettleNotify}
   */
  public static final class SummerTimeV2BoatSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeV2BoatSettleNotify)
      SummerTimeV2BoatSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeV2BoatSettleNotify.newBuilder() to construct.
    private SummerTimeV2BoatSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeV2BoatSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeV2BoatSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeV2BoatSettleNotify(
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
            case 18: {
              SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 96: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 112: {

              stageId_ = input.readUInt32();
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
      return SummerTimeV2BoatSettleNotifyOuterClass.internal_static_SummerTimeV2BoatSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SummerTimeV2BoatSettleNotifyOuterClass.internal_static_SummerTimeV2BoatSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.class, SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code SummerTimeV2BoatSettleNotify.GBJCFKPKGJG}
     */
    public enum GBJCFKPKGJG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8520;</code>
       */
      PEPPOHPHJOJ(1, 8520),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GBJCFKPKGJG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8520;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8520;
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
      public static GBJCFKPKGJG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GBJCFKPKGJG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8520: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GBJCFKPKGJG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GBJCFKPKGJG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GBJCFKPKGJG>() {
              public GBJCFKPKGJG findValueByNumber(int number) {
                return GBJCFKPKGJG.forNumber(number);
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
        return SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final GBJCFKPKGJG[] VALUES = getStaticValuesArray();
      private static GBJCFKPKGJG[] getStaticValuesArray() {
        return new GBJCFKPKGJG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static GBJCFKPKGJG valueOf(
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

      private GBJCFKPKGJG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SummerTimeV2BoatSettleNotify.GBJCFKPKGJG)
    }

    public static final int SETTLEINFO_FIELD_NUMBER = 2;
    private SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo settleInfo_;
    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getSettleInfo() {
      return settleInfo_ == null ? SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
     */
    @java.lang.Override
    public SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int STAGEID_FIELD_NUMBER = 14;
    private int stageId_;
    /**
     * <code>uint32 stageId = 14;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int GALLERYID_FIELD_NUMBER = 10;
    private int galleryId_;
    /**
     * <code>uint32 galleryId = 10;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int ISNEWRECORD_FIELD_NUMBER = 12;
    private boolean isNewRecord_;
    /**
     * <code>bool isNewRecord = 12;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (settleInfo_ != null) {
        output.writeMessage(2, getSettleInfo());
      }
      if (galleryId_ != 0) {
        output.writeUInt32(10, galleryId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(12, isNewRecord_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(14, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSettleInfo());
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, galleryId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNewRecord_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, stageId_);
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
      if (!(obj instanceof SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify)) {
        return super.equals(obj);
      }
      SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify other = (SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getStageId()
          != other.getStageId()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + GALLERYID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + ISNEWRECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parseFrom(
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
    public static Builder newBuilder(SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify prototype) {
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
     * Protobuf type {@code SummerTimeV2BoatSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeV2BoatSettleNotify)
        SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SummerTimeV2BoatSettleNotifyOuterClass.internal_static_SummerTimeV2BoatSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SummerTimeV2BoatSettleNotifyOuterClass.internal_static_SummerTimeV2BoatSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.class, SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.Builder.class);
      }

      // Construct using SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.newBuilder()
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
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        stageId_ = 0;

        galleryId_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SummerTimeV2BoatSettleNotifyOuterClass.internal_static_SummerTimeV2BoatSettleNotify_descriptor;
      }

      @java.lang.Override
      public SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify getDefaultInstanceForType() {
        return SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify build() {
        SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify buildPartial() {
        SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify result = new SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify(this);
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.stageId_ = stageId_;
        result.galleryId_ = galleryId_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify) {
          return mergeFrom((SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify other) {
        if (other == SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       * @return The settleInfo.
       */
      public SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public Builder setSettleInfo(SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public Builder setSettleInfo(
          SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public Builder mergeSettleInfo(SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      public SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.SummerTimeV2BoatGallerySettleInfo settleInfo = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder, SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 14;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 14;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 galleryId = 10;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 galleryId = 10;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 galleryId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool isNewRecord = 12;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool isNewRecord = 12;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isNewRecord = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeV2BoatSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeV2BoatSettleNotify)
    private static final SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify();
    }

    public static SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeV2BoatSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeV2BoatSettleNotify>() {
      @java.lang.Override
      public SummerTimeV2BoatSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeV2BoatSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeV2BoatSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeV2BoatSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SummerTimeV2BoatSettleNotifyOuterClass.SummerTimeV2BoatSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeV2BoatSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeV2BoatSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"SummerTimeV2BoatSettleNotify.proto\032\'Su" +
      "mmerTimeV2BoatGallerySettleInfo.proto\"\340\001" +
      "\n\034SummerTimeV2BoatSettleNotify\0226\n\nsettle" +
      "Info\030\002 \001(\0132\".SummerTimeV2BoatGallerySett" +
      "leInfo\022\017\n\007stageId\030\016 \001(\r\022\021\n\tgalleryId\030\n \001" +
      "(\r\022\023\n\013isNewRecord\030\014 \001(\010\"O\n\013GBJCFKPKGJG\022\010" +
      "\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\310B\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SummerTimeV2BoatGallerySettleInfoOuterClass.getDescriptor(),
        });
    internal_static_SummerTimeV2BoatSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeV2BoatSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeV2BoatSettleNotify_descriptor,
        new java.lang.String[] { "SettleInfo", "StageId", "GalleryId", "IsNewRecord", });
    SummerTimeV2BoatGallerySettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
