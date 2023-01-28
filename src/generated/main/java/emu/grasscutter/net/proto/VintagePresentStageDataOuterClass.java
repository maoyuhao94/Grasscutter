// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintagePresentStageData.proto

public final class VintagePresentStageDataOuterClass {
  private VintagePresentStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintagePresentStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintagePresentStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isFinish = 4;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 openTime = 14;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool isOpen = 9;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    int getPresentLevelMapCount();
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    boolean containsPresentLevelMap(
        int key);
    /**
     * Use {@link #getPresentLevelMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
    getPresentLevelMap();
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
    getPresentLevelMapMap();
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */

    VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrDefault(
        int key,
        VintagePresentLevelDataOuterClass.VintagePresentLevelData defaultValue);
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */

    VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrThrow(
        int key);

    /**
     * <code>uint32 stageId = 15;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code VintagePresentStageData}
   */
  public static final class VintagePresentStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintagePresentStageData)
      VintagePresentStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintagePresentStageData.newBuilder() to construct.
    private VintagePresentStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintagePresentStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintagePresentStageData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintagePresentStageData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 32: {

              isFinish_ = input.readBool();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                presentLevelMap_ = com.google.protobuf.MapField.newMapField(
                    PresentLevelMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
              presentLevelMap__ = input.readMessage(
                  PresentLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              presentLevelMap_.getMutableMap().put(
                  presentLevelMap__.getKey(), presentLevelMap__.getValue());
              break;
            }
            case 72: {

              isOpen_ = input.readBool();
              break;
            }
            case 112: {

              openTime_ = input.readUInt32();
              break;
            }
            case 120: {

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
      return VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetPresentLevelMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VintagePresentStageDataOuterClass.VintagePresentStageData.class, VintagePresentStageDataOuterClass.VintagePresentStageData.Builder.class);
    }

    public static final int ISFINISH_FIELD_NUMBER = 4;
    private boolean isFinish_;
    /**
     * <code>bool isFinish = 4;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int OPENTIME_FIELD_NUMBER = 14;
    private int openTime_;
    /**
     * <code>uint32 openTime = 14;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int ISOPEN_FIELD_NUMBER = 9;
    private boolean isOpen_;
    /**
     * <code>bool isOpen = 9;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int PRESENTLEVELMAP_FIELD_NUMBER = 7;
    private static final class PresentLevelMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>newDefaultInstance(
                  VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_PresentLevelMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  VintagePresentLevelDataOuterClass.VintagePresentLevelData.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> presentLevelMap_;
    private com.google.protobuf.MapField<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
    internalGetPresentLevelMap() {
      if (presentLevelMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PresentLevelMapDefaultEntryHolder.defaultEntry);
      }
      return presentLevelMap_;
    }

    public int getPresentLevelMapCount() {
      return internalGetPresentLevelMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */

    @java.lang.Override
    public boolean containsPresentLevelMap(
        int key) {
      
      return internalGetPresentLevelMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPresentLevelMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> getPresentLevelMap() {
      return getPresentLevelMapMap();
    }
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> getPresentLevelMapMap() {
      return internalGetPresentLevelMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    @java.lang.Override

    public VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrDefault(
        int key,
        VintagePresentLevelDataOuterClass.VintagePresentLevelData defaultValue) {
      
      java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> map =
          internalGetPresentLevelMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
     */
    @java.lang.Override

    public VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> map =
          internalGetPresentLevelMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int STAGEID_FIELD_NUMBER = 15;
    private int stageId_;
    /**
     * <code>uint32 stageId = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (isFinish_ != false) {
        output.writeBool(4, isFinish_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPresentLevelMap(),
          PresentLevelMapDefaultEntryHolder.defaultEntry,
          7);
      if (isOpen_ != false) {
        output.writeBool(9, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(14, openTime_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isFinish_);
      }
      for (java.util.Map.Entry<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> entry
           : internalGetPresentLevelMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
        presentLevelMap__ = PresentLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, presentLevelMap__);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, openTime_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof VintagePresentStageDataOuterClass.VintagePresentStageData)) {
        return super.equals(obj);
      }
      VintagePresentStageDataOuterClass.VintagePresentStageData other = (VintagePresentStageDataOuterClass.VintagePresentStageData) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!internalGetPresentLevelMap().equals(
          other.internalGetPresentLevelMap())) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + ISFINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + OPENTIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      if (!internalGetPresentLevelMap().getMap().isEmpty()) {
        hash = (37 * hash) + PRESENTLEVELMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPresentLevelMap().hashCode();
      }
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VintagePresentStageDataOuterClass.VintagePresentStageData parseFrom(
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
    public static Builder newBuilder(VintagePresentStageDataOuterClass.VintagePresentStageData prototype) {
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
     * Protobuf type {@code VintagePresentStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintagePresentStageData)
        VintagePresentStageDataOuterClass.VintagePresentStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetPresentLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutablePresentLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                VintagePresentStageDataOuterClass.VintagePresentStageData.class, VintagePresentStageDataOuterClass.VintagePresentStageData.Builder.class);
      }

      // Construct using VintagePresentStageDataOuterClass.VintagePresentStageData.newBuilder()
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
        isFinish_ = false;

        openTime_ = 0;

        isOpen_ = false;

        internalGetMutablePresentLevelMap().clear();
        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VintagePresentStageDataOuterClass.internal_static_VintagePresentStageData_descriptor;
      }

      @java.lang.Override
      public VintagePresentStageDataOuterClass.VintagePresentStageData getDefaultInstanceForType() {
        return VintagePresentStageDataOuterClass.VintagePresentStageData.getDefaultInstance();
      }

      @java.lang.Override
      public VintagePresentStageDataOuterClass.VintagePresentStageData build() {
        VintagePresentStageDataOuterClass.VintagePresentStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public VintagePresentStageDataOuterClass.VintagePresentStageData buildPartial() {
        VintagePresentStageDataOuterClass.VintagePresentStageData result = new VintagePresentStageDataOuterClass.VintagePresentStageData(this);
        int from_bitField0_ = bitField0_;
        result.isFinish_ = isFinish_;
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.presentLevelMap_ = internalGetPresentLevelMap();
        result.presentLevelMap_.makeImmutable();
        result.stageId_ = stageId_;
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
        if (other instanceof VintagePresentStageDataOuterClass.VintagePresentStageData) {
          return mergeFrom((VintagePresentStageDataOuterClass.VintagePresentStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(VintagePresentStageDataOuterClass.VintagePresentStageData other) {
        if (other == VintagePresentStageDataOuterClass.VintagePresentStageData.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        internalGetMutablePresentLevelMap().mergeFrom(
            other.internalGetPresentLevelMap());
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        VintagePresentStageDataOuterClass.VintagePresentStageData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (VintagePresentStageDataOuterClass.VintagePresentStageData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isFinish_ ;
      /**
       * <code>bool isFinish = 4;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool isFinish = 4;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isFinish = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 openTime = 14;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 openTime = 14;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 openTime = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 9;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 9;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> presentLevelMap_;
      private com.google.protobuf.MapField<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
      internalGetPresentLevelMap() {
        if (presentLevelMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PresentLevelMapDefaultEntryHolder.defaultEntry);
        }
        return presentLevelMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
      internalGetMutablePresentLevelMap() {
        onChanged();;
        if (presentLevelMap_ == null) {
          presentLevelMap_ = com.google.protobuf.MapField.newMapField(
              PresentLevelMapDefaultEntryHolder.defaultEntry);
        }
        if (!presentLevelMap_.isMutable()) {
          presentLevelMap_ = presentLevelMap_.copy();
        }
        return presentLevelMap_;
      }

      public int getPresentLevelMapCount() {
        return internalGetPresentLevelMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */

      @java.lang.Override
      public boolean containsPresentLevelMap(
          int key) {
        
        return internalGetPresentLevelMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPresentLevelMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> getPresentLevelMap() {
        return getPresentLevelMapMap();
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> getPresentLevelMapMap() {
        return internalGetPresentLevelMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */
      @java.lang.Override

      public VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrDefault(
          int key,
          VintagePresentLevelDataOuterClass.VintagePresentLevelData defaultValue) {
        
        java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> map =
            internalGetPresentLevelMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */
      @java.lang.Override

      public VintagePresentLevelDataOuterClass.VintagePresentLevelData getPresentLevelMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> map =
            internalGetPresentLevelMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearPresentLevelMap() {
        internalGetMutablePresentLevelMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */

      public Builder removePresentLevelMap(
          int key) {
        
        internalGetMutablePresentLevelMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData>
      getMutablePresentLevelMap() {
        return internalGetMutablePresentLevelMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */
      public Builder putPresentLevelMap(
          int key,
          VintagePresentLevelDataOuterClass.VintagePresentLevelData value) {
        
        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutablePresentLevelMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .VintagePresentLevelData&gt; presentLevelMap = 7;</code>
       */

      public Builder putAllPresentLevelMap(
          java.util.Map<java.lang.Integer, VintagePresentLevelDataOuterClass.VintagePresentLevelData> values) {
        internalGetMutablePresentLevelMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintagePresentStageData)
    }

    // @@protoc_insertion_point(class_scope:VintagePresentStageData)
    private static final VintagePresentStageDataOuterClass.VintagePresentStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new VintagePresentStageDataOuterClass.VintagePresentStageData();
    }

    public static VintagePresentStageDataOuterClass.VintagePresentStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintagePresentStageData>
        PARSER = new com.google.protobuf.AbstractParser<VintagePresentStageData>() {
      @java.lang.Override
      public VintagePresentStageData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintagePresentStageData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintagePresentStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintagePresentStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public VintagePresentStageDataOuterClass.VintagePresentStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintagePresentStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintagePresentStageData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintagePresentStageData_PresentLevelMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintagePresentStageData_PresentLevelMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035VintagePresentStageData.proto\032\035Vintage" +
      "PresentLevelData.proto\"\370\001\n\027VintagePresen" +
      "tStageData\022\020\n\010isFinish\030\004 \001(\010\022\020\n\010openTime" +
      "\030\016 \001(\r\022\016\n\006isOpen\030\t \001(\010\022F\n\017presentLevelMa" +
      "p\030\007 \003(\0132-.VintagePresentStageData.Presen" +
      "tLevelMapEntry\022\017\n\007stageId\030\017 \001(\r\032P\n\024Prese" +
      "ntLevelMapEntry\022\013\n\003key\030\001 \001(\r\022\'\n\005value\030\002 " +
      "\001(\0132\030.VintagePresentLevelData:\0028\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          VintagePresentLevelDataOuterClass.getDescriptor(),
        });
    internal_static_VintagePresentStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintagePresentStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintagePresentStageData_descriptor,
        new java.lang.String[] { "IsFinish", "OpenTime", "IsOpen", "PresentLevelMap", "StageId", });
    internal_static_VintagePresentStageData_PresentLevelMapEntry_descriptor =
      internal_static_VintagePresentStageData_descriptor.getNestedTypes().get(0);
    internal_static_VintagePresentStageData_PresentLevelMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintagePresentStageData_PresentLevelMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    VintagePresentLevelDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
