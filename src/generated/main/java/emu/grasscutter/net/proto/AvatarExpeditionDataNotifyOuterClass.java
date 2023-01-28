// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionDataNotify.proto

public final class AvatarExpeditionDataNotifyOuterClass {
  private AvatarExpeditionDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    int getExpeditionInfoMapCount();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    boolean containsExpeditionInfoMap(
        long key);
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMapMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */

    AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue);
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */

    AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key);
  }
  /**
   * Protobuf type {@code AvatarExpeditionDataNotify}
   */
  public static final class AvatarExpeditionDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionDataNotify)
      AvatarExpeditionDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionDataNotify.newBuilder() to construct.
    private AvatarExpeditionDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarExpeditionDataNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                expeditionInfoMap_ = com.google.protobuf.MapField.newMapField(
                    ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
              expeditionInfoMap__ = input.readMessage(
                  ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              expeditionInfoMap_.getMutableMap().put(
                  expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
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
      return AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetExpeditionInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.class, AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarExpeditionDataNotify.INDPMHLNJFH}
     */
    public enum INDPMHLNJFH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1638;</code>
       */
      PEPPOHPHJOJ(1, 1638),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final INDPMHLNJFH DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1638;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1638;
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
      public static INDPMHLNJFH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static INDPMHLNJFH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1638: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<INDPMHLNJFH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          INDPMHLNJFH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<INDPMHLNJFH>() {
              public INDPMHLNJFH findValueByNumber(int number) {
                return INDPMHLNJFH.forNumber(number);
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
        return AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final INDPMHLNJFH[] VALUES = getStaticValuesArray();
      private static INDPMHLNJFH[] getStaticValuesArray() {
        return new INDPMHLNJFH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static INDPMHLNJFH valueOf(
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

      private INDPMHLNJFH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarExpeditionDataNotify.INDPMHLNJFH)
    }

    public static final int EXPEDITIONINFOMAP_FIELD_NUMBER = 4;
    private static final class ExpeditionInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>newDefaultInstance(
                  AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT64,
                  0L,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
    private com.google.protobuf.MapField<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    internalGetExpeditionInfoMap() {
      if (expeditionInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
      }
      return expeditionInfoMap_;
    }

    public int getExpeditionInfoMapCount() {
      return internalGetExpeditionInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */

    @java.lang.Override
    public boolean containsExpeditionInfoMap(
        long key) {
      
      return internalGetExpeditionInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
      return getExpeditionInfoMapMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
      return internalGetExpeditionInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    @java.lang.Override

    public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
      
      java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
     */
    @java.lang.Override

    public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
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
      com.google.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetExpeditionInfoMap(),
          ExpeditionInfoMapDefaultEntryHolder.defaultEntry,
          4);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry
           : internalGetExpeditionInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
        expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, expeditionInfoMap__);
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
      if (!(obj instanceof AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify)) {
        return super.equals(obj);
      }
      AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify other = (AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify) obj;

      if (!internalGetExpeditionInfoMap().equals(
          other.internalGetExpeditionInfoMap())) return false;
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
      if (!internalGetExpeditionInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + EXPEDITIONINFOMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExpeditionInfoMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parseFrom(
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
    public static Builder newBuilder(AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify prototype) {
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
     * Protobuf type {@code AvatarExpeditionDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionDataNotify)
        AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.class, AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.Builder.class);
      }

      // Construct using AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.newBuilder()
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
        internalGetMutableExpeditionInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AvatarExpeditionDataNotifyOuterClass.internal_static_AvatarExpeditionDataNotify_descriptor;
      }

      @java.lang.Override
      public AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify getDefaultInstanceForType() {
        return AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify build() {
        AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify buildPartial() {
        AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify result = new AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify(this);
        int from_bitField0_ = bitField0_;
        result.expeditionInfoMap_ = internalGetExpeditionInfoMap();
        result.expeditionInfoMap_.makeImmutable();
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
        if (other instanceof AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify) {
          return mergeFrom((AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify other) {
        if (other == AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify.getDefaultInstance()) return this;
        internalGetMutableExpeditionInfoMap().mergeFrom(
            other.internalGetExpeditionInfoMap());
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
        AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
      private com.google.protobuf.MapField<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      internalGetExpeditionInfoMap() {
        if (expeditionInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        return expeditionInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      internalGetMutableExpeditionInfoMap() {
        onChanged();;
        if (expeditionInfoMap_ == null) {
          expeditionInfoMap_ = com.google.protobuf.MapField.newMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!expeditionInfoMap_.isMutable()) {
          expeditionInfoMap_ = expeditionInfoMap_.copy();
        }
        return expeditionInfoMap_;
      }

      public int getExpeditionInfoMapCount() {
        return internalGetExpeditionInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */

      @java.lang.Override
      public boolean containsExpeditionInfoMap(
          long key) {
        
        return internalGetExpeditionInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getExpeditionInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
        return getExpeditionInfoMapMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
        return internalGetExpeditionInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */
      @java.lang.Override

      public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
          long key,
          AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
        
        java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */
      @java.lang.Override

      public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
          long key) {
        
        java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearExpeditionInfoMap() {
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */

      public Builder removeExpeditionInfoMap(
          long key) {
        
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      getMutableExpeditionInfoMap() {
        return internalGetMutableExpeditionInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */
      public Builder putExpeditionInfoMap(
          long key,
          AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {
        
        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutableExpeditionInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expeditionInfoMap = 4;</code>
       */

      public Builder putAllExpeditionInfoMap(
          java.util.Map<java.lang.Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
        internalGetMutableExpeditionInfoMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionDataNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionDataNotify)
    private static final AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify();
    }

    public static AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionDataNotify>() {
      @java.lang.Override
      public AvatarExpeditionDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarExpeditionDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarExpeditionDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AvatarExpeditionDataNotifyOuterClass.AvatarExpeditionDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionDataNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AvatarExpeditionDataNotify.proto\032\032Avat" +
      "arExpeditionInfo.proto\"\215\002\n\032AvatarExpedit" +
      "ionDataNotify\022M\n\021expeditionInfoMap\030\004 \003(\013" +
      "22.AvatarExpeditionDataNotify.Expedition" +
      "InfoMapEntry\032O\n\026ExpeditionInfoMapEntry\022\013" +
      "\n\003key\030\001 \001(\004\022$\n\005value\030\002 \001(\0132\025.AvatarExped" +
      "itionInfo:\0028\001\"O\n\013INDPMHLNJFH\022\010\n\004NONE\020\000\022\020" +
      "\n\013PEPPOHPHJOJ\020\346\014\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AvatarExpeditionInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarExpeditionDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionDataNotify_descriptor,
        new java.lang.String[] { "ExpeditionInfoMap", });
    internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_descriptor =
      internal_static_AvatarExpeditionDataNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionDataNotify_ExpeditionInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    AvatarExpeditionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
