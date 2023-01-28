// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonAbstract.proto

public final class CustomDungeonAbstractOuterClass {
  private CustomDungeonAbstractOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonAbstractOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonAbstract)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_EJGBHGHLFPI = 10;</code>
     * @return The unk3300EJGBHGHLFPI.
     */
    int getUnk3300EJGBHGHLFPI();

    /**
     * <code>uint32 Unk3300_JPFIHKECLMF = 2;</code>
     * @return The unk3300JPFIHKECLMF.
     */
    int getUnk3300JPFIHKECLMF();

    /**
     * <code>uint32 firstPublishTime = 1;</code>
     * @return The firstPublishTime.
     */
    int getFirstPublishTime();

    /**
     * <code>uint32 lastPublishTime = 4;</code>
     * @return The lastPublishTime.
     */
    int getLastPublishTime();

    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    int getBrickStatisticsMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    boolean containsBrickStatisticsMap(
        int key);
    /**
     * Use {@link #getBrickStatisticsMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBrickStatisticsMap();
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getBrickStatisticsMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */

    int getBrickStatisticsMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */

    int getBrickStatisticsMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code CustomDungeonAbstract}
   */
  public static final class CustomDungeonAbstract extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonAbstract)
      CustomDungeonAbstractOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonAbstract.newBuilder() to construct.
    private CustomDungeonAbstract(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonAbstract() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonAbstract();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonAbstract(
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
            case 8: {

              firstPublishTime_ = input.readUInt32();
              break;
            }
            case 16: {

              unk3300JPFIHKECLMF_ = input.readUInt32();
              break;
            }
            case 32: {

              lastPublishTime_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3300EJGBHGHLFPI_ = input.readUInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                brickStatisticsMap_ = com.google.protobuf.MapField.newMapField(
                    BrickStatisticsMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              brickStatisticsMap__ = input.readMessage(
                  BrickStatisticsMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              brickStatisticsMap_.getMutableMap().put(
                  brickStatisticsMap__.getKey(), brickStatisticsMap__.getValue());
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
      return CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetBrickStatisticsMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CustomDungeonAbstractOuterClass.CustomDungeonAbstract.class, CustomDungeonAbstractOuterClass.CustomDungeonAbstract.Builder.class);
    }

    public static final int UNK3300_EJGBHGHLFPI_FIELD_NUMBER = 10;
    private int unk3300EJGBHGHLFPI_;
    /**
     * <code>uint32 Unk3300_EJGBHGHLFPI = 10;</code>
     * @return The unk3300EJGBHGHLFPI.
     */
    @java.lang.Override
    public int getUnk3300EJGBHGHLFPI() {
      return unk3300EJGBHGHLFPI_;
    }

    public static final int UNK3300_JPFIHKECLMF_FIELD_NUMBER = 2;
    private int unk3300JPFIHKECLMF_;
    /**
     * <code>uint32 Unk3300_JPFIHKECLMF = 2;</code>
     * @return The unk3300JPFIHKECLMF.
     */
    @java.lang.Override
    public int getUnk3300JPFIHKECLMF() {
      return unk3300JPFIHKECLMF_;
    }

    public static final int FIRSTPUBLISHTIME_FIELD_NUMBER = 1;
    private int firstPublishTime_;
    /**
     * <code>uint32 firstPublishTime = 1;</code>
     * @return The firstPublishTime.
     */
    @java.lang.Override
    public int getFirstPublishTime() {
      return firstPublishTime_;
    }

    public static final int LASTPUBLISHTIME_FIELD_NUMBER = 4;
    private int lastPublishTime_;
    /**
     * <code>uint32 lastPublishTime = 4;</code>
     * @return The lastPublishTime.
     */
    @java.lang.Override
    public int getLastPublishTime() {
      return lastPublishTime_;
    }

    public static final int BRICKSTATISTICSMAP_FIELD_NUMBER = 12;
    private static final class BrickStatisticsMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> brickStatisticsMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetBrickStatisticsMap() {
      if (brickStatisticsMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BrickStatisticsMapDefaultEntryHolder.defaultEntry);
      }
      return brickStatisticsMap_;
    }

    public int getBrickStatisticsMapCount() {
      return internalGetBrickStatisticsMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */

    @java.lang.Override
    public boolean containsBrickStatisticsMap(
        int key) {
      
      return internalGetBrickStatisticsMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBrickStatisticsMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMap() {
      return getBrickStatisticsMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMapMap() {
      return internalGetBrickStatisticsMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    @java.lang.Override

    public int getBrickStatisticsMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBrickStatisticsMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
     */
    @java.lang.Override

    public int getBrickStatisticsMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetBrickStatisticsMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (firstPublishTime_ != 0) {
        output.writeUInt32(1, firstPublishTime_);
      }
      if (unk3300JPFIHKECLMF_ != 0) {
        output.writeUInt32(2, unk3300JPFIHKECLMF_);
      }
      if (lastPublishTime_ != 0) {
        output.writeUInt32(4, lastPublishTime_);
      }
      if (unk3300EJGBHGHLFPI_ != 0) {
        output.writeUInt32(10, unk3300EJGBHGHLFPI_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetBrickStatisticsMap(),
          BrickStatisticsMapDefaultEntryHolder.defaultEntry,
          12);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (firstPublishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, firstPublishTime_);
      }
      if (unk3300JPFIHKECLMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300JPFIHKECLMF_);
      }
      if (lastPublishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lastPublishTime_);
      }
      if (unk3300EJGBHGHLFPI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300EJGBHGHLFPI_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetBrickStatisticsMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        brickStatisticsMap__ = BrickStatisticsMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, brickStatisticsMap__);
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
      if (!(obj instanceof CustomDungeonAbstractOuterClass.CustomDungeonAbstract)) {
        return super.equals(obj);
      }
      CustomDungeonAbstractOuterClass.CustomDungeonAbstract other = (CustomDungeonAbstractOuterClass.CustomDungeonAbstract) obj;

      if (getUnk3300EJGBHGHLFPI()
          != other.getUnk3300EJGBHGHLFPI()) return false;
      if (getUnk3300JPFIHKECLMF()
          != other.getUnk3300JPFIHKECLMF()) return false;
      if (getFirstPublishTime()
          != other.getFirstPublishTime()) return false;
      if (getLastPublishTime()
          != other.getLastPublishTime()) return false;
      if (!internalGetBrickStatisticsMap().equals(
          other.internalGetBrickStatisticsMap())) return false;
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
      hash = (37 * hash) + UNK3300_EJGBHGHLFPI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EJGBHGHLFPI();
      hash = (37 * hash) + UNK3300_JPFIHKECLMF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JPFIHKECLMF();
      hash = (37 * hash) + FIRSTPUBLISHTIME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstPublishTime();
      hash = (37 * hash) + LASTPUBLISHTIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastPublishTime();
      if (!internalGetBrickStatisticsMap().getMap().isEmpty()) {
        hash = (37 * hash) + BRICKSTATISTICSMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetBrickStatisticsMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract parseFrom(
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
    public static Builder newBuilder(CustomDungeonAbstractOuterClass.CustomDungeonAbstract prototype) {
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
     * Protobuf type {@code CustomDungeonAbstract}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonAbstract)
        CustomDungeonAbstractOuterClass.CustomDungeonAbstractOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetBrickStatisticsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableBrickStatisticsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CustomDungeonAbstractOuterClass.CustomDungeonAbstract.class, CustomDungeonAbstractOuterClass.CustomDungeonAbstract.Builder.class);
      }

      // Construct using CustomDungeonAbstractOuterClass.CustomDungeonAbstract.newBuilder()
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
        unk3300EJGBHGHLFPI_ = 0;

        unk3300JPFIHKECLMF_ = 0;

        firstPublishTime_ = 0;

        lastPublishTime_ = 0;

        internalGetMutableBrickStatisticsMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CustomDungeonAbstractOuterClass.internal_static_CustomDungeonAbstract_descriptor;
      }

      @java.lang.Override
      public CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstanceForType() {
        return CustomDungeonAbstractOuterClass.CustomDungeonAbstract.getDefaultInstance();
      }

      @java.lang.Override
      public CustomDungeonAbstractOuterClass.CustomDungeonAbstract build() {
        CustomDungeonAbstractOuterClass.CustomDungeonAbstract result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CustomDungeonAbstractOuterClass.CustomDungeonAbstract buildPartial() {
        CustomDungeonAbstractOuterClass.CustomDungeonAbstract result = new CustomDungeonAbstractOuterClass.CustomDungeonAbstract(this);
        int from_bitField0_ = bitField0_;
        result.unk3300EJGBHGHLFPI_ = unk3300EJGBHGHLFPI_;
        result.unk3300JPFIHKECLMF_ = unk3300JPFIHKECLMF_;
        result.firstPublishTime_ = firstPublishTime_;
        result.lastPublishTime_ = lastPublishTime_;
        result.brickStatisticsMap_ = internalGetBrickStatisticsMap();
        result.brickStatisticsMap_.makeImmutable();
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
        if (other instanceof CustomDungeonAbstractOuterClass.CustomDungeonAbstract) {
          return mergeFrom((CustomDungeonAbstractOuterClass.CustomDungeonAbstract)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CustomDungeonAbstractOuterClass.CustomDungeonAbstract other) {
        if (other == CustomDungeonAbstractOuterClass.CustomDungeonAbstract.getDefaultInstance()) return this;
        if (other.getUnk3300EJGBHGHLFPI() != 0) {
          setUnk3300EJGBHGHLFPI(other.getUnk3300EJGBHGHLFPI());
        }
        if (other.getUnk3300JPFIHKECLMF() != 0) {
          setUnk3300JPFIHKECLMF(other.getUnk3300JPFIHKECLMF());
        }
        if (other.getFirstPublishTime() != 0) {
          setFirstPublishTime(other.getFirstPublishTime());
        }
        if (other.getLastPublishTime() != 0) {
          setLastPublishTime(other.getLastPublishTime());
        }
        internalGetMutableBrickStatisticsMap().mergeFrom(
            other.internalGetBrickStatisticsMap());
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
        CustomDungeonAbstractOuterClass.CustomDungeonAbstract parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CustomDungeonAbstractOuterClass.CustomDungeonAbstract) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk3300EJGBHGHLFPI_ ;
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 10;</code>
       * @return The unk3300EJGBHGHLFPI.
       */
      @java.lang.Override
      public int getUnk3300EJGBHGHLFPI() {
        return unk3300EJGBHGHLFPI_;
      }
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 10;</code>
       * @param value The unk3300EJGBHGHLFPI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EJGBHGHLFPI(int value) {
        
        unk3300EJGBHGHLFPI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EJGBHGHLFPI = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EJGBHGHLFPI() {
        
        unk3300EJGBHGHLFPI_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JPFIHKECLMF_ ;
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 2;</code>
       * @return The unk3300JPFIHKECLMF.
       */
      @java.lang.Override
      public int getUnk3300JPFIHKECLMF() {
        return unk3300JPFIHKECLMF_;
      }
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 2;</code>
       * @param value The unk3300JPFIHKECLMF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JPFIHKECLMF(int value) {
        
        unk3300JPFIHKECLMF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JPFIHKECLMF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JPFIHKECLMF() {
        
        unk3300JPFIHKECLMF_ = 0;
        onChanged();
        return this;
      }

      private int firstPublishTime_ ;
      /**
       * <code>uint32 firstPublishTime = 1;</code>
       * @return The firstPublishTime.
       */
      @java.lang.Override
      public int getFirstPublishTime() {
        return firstPublishTime_;
      }
      /**
       * <code>uint32 firstPublishTime = 1;</code>
       * @param value The firstPublishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFirstPublishTime(int value) {
        
        firstPublishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 firstPublishTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstPublishTime() {
        
        firstPublishTime_ = 0;
        onChanged();
        return this;
      }

      private int lastPublishTime_ ;
      /**
       * <code>uint32 lastPublishTime = 4;</code>
       * @return The lastPublishTime.
       */
      @java.lang.Override
      public int getLastPublishTime() {
        return lastPublishTime_;
      }
      /**
       * <code>uint32 lastPublishTime = 4;</code>
       * @param value The lastPublishTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastPublishTime(int value) {
        
        lastPublishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lastPublishTime = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastPublishTime() {
        
        lastPublishTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> brickStatisticsMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetBrickStatisticsMap() {
        if (brickStatisticsMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              BrickStatisticsMapDefaultEntryHolder.defaultEntry);
        }
        return brickStatisticsMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableBrickStatisticsMap() {
        onChanged();;
        if (brickStatisticsMap_ == null) {
          brickStatisticsMap_ = com.google.protobuf.MapField.newMapField(
              BrickStatisticsMapDefaultEntryHolder.defaultEntry);
        }
        if (!brickStatisticsMap_.isMutable()) {
          brickStatisticsMap_ = brickStatisticsMap_.copy();
        }
        return brickStatisticsMap_;
      }

      public int getBrickStatisticsMapCount() {
        return internalGetBrickStatisticsMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */

      @java.lang.Override
      public boolean containsBrickStatisticsMap(
          int key) {
        
        return internalGetBrickStatisticsMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getBrickStatisticsMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMap() {
        return getBrickStatisticsMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getBrickStatisticsMapMap() {
        return internalGetBrickStatisticsMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */
      @java.lang.Override

      public int getBrickStatisticsMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBrickStatisticsMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */
      @java.lang.Override

      public int getBrickStatisticsMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetBrickStatisticsMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearBrickStatisticsMap() {
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */

      public Builder removeBrickStatisticsMap(
          int key) {
        
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableBrickStatisticsMap() {
        return internalGetMutableBrickStatisticsMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */
      public Builder putBrickStatisticsMap(
          int key,
          int value) {
        
        
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; brickStatisticsMap = 12;</code>
       */

      public Builder putAllBrickStatisticsMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableBrickStatisticsMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonAbstract)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonAbstract)
    private static final CustomDungeonAbstractOuterClass.CustomDungeonAbstract DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CustomDungeonAbstractOuterClass.CustomDungeonAbstract();
    }

    public static CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonAbstract>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonAbstract>() {
      @java.lang.Override
      public CustomDungeonAbstract parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonAbstract(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonAbstract> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonAbstract> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CustomDungeonAbstractOuterClass.CustomDungeonAbstract getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonAbstract_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonAbstract_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CustomDungeonAbstract.proto\"\213\002\n\025Custom" +
      "DungeonAbstract\022\033\n\023Unk3300_EJGBHGHLFPI\030\n" +
      " \001(\r\022\033\n\023Unk3300_JPFIHKECLMF\030\002 \001(\r\022\030\n\020fir" +
      "stPublishTime\030\001 \001(\r\022\027\n\017lastPublishTime\030\004" +
      " \001(\r\022J\n\022brickStatisticsMap\030\014 \003(\0132..Custo" +
      "mDungeonAbstract.BrickStatisticsMapEntry" +
      "\0329\n\027BrickStatisticsMapEntry\022\013\n\003key\030\001 \001(\r" +
      "\022\r\n\005value\030\002 \001(\r:\0028\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonAbstract_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonAbstract_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonAbstract_descriptor,
        new java.lang.String[] { "Unk3300EJGBHGHLFPI", "Unk3300JPFIHKECLMF", "FirstPublishTime", "LastPublishTime", "BrickStatisticsMap", });
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor =
      internal_static_CustomDungeonAbstract_descriptor.getNestedTypes().get(0);
    internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonAbstract_BrickStatisticsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
