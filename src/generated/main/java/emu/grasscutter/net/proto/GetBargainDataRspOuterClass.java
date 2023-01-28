// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBargainDataRsp.proto

public final class GetBargainDataRspOuterClass {
  private GetBargainDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBargainDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetBargainDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     * @return Whether the snapshot field is set.
     */
    boolean hasSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     * @return The snapshot.
     */
    BargainSnapshotOuterClass.BargainSnapshot getSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     */
    BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder();

    /**
     * <code>uint32 bargainId = 8;</code>
     * @return The bargainId.
     */
    int getBargainId();
  }
  /**
   * Protobuf type {@code GetBargainDataRsp}
   */
  public static final class GetBargainDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetBargainDataRsp)
      GetBargainDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetBargainDataRsp.newBuilder() to construct.
    private GetBargainDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBargainDataRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetBargainDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetBargainDataRsp(
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
            case 64: {

              bargainId_ = input.readUInt32();
              break;
            }
            case 106: {
              BargainSnapshotOuterClass.BargainSnapshot.Builder subBuilder = null;
              if (snapshot_ != null) {
                subBuilder = snapshot_.toBuilder();
              }
              snapshot_ = input.readMessage(BargainSnapshotOuterClass.BargainSnapshot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(snapshot_);
                snapshot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetBargainDataRspOuterClass.GetBargainDataRsp.class, GetBargainDataRspOuterClass.GetBargainDataRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GetBargainDataRsp.PDPLCGAFFNN}
     */
    public enum PDPLCGAFFNN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 473;</code>
       */
      PEPPOHPHJOJ(1, 473),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PDPLCGAFFNN DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 473;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 473;
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
      public static PDPLCGAFFNN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PDPLCGAFFNN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 473: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PDPLCGAFFNN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PDPLCGAFFNN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PDPLCGAFFNN>() {
              public PDPLCGAFFNN findValueByNumber(int number) {
                return PDPLCGAFFNN.forNumber(number);
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
        return GetBargainDataRspOuterClass.GetBargainDataRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final PDPLCGAFFNN[] VALUES = getStaticValuesArray();
      private static PDPLCGAFFNN[] getStaticValuesArray() {
        return new PDPLCGAFFNN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static PDPLCGAFFNN valueOf(
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

      private PDPLCGAFFNN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GetBargainDataRsp.PDPLCGAFFNN)
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SNAPSHOT_FIELD_NUMBER = 13;
    private BargainSnapshotOuterClass.BargainSnapshot snapshot_;
    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     * @return Whether the snapshot field is set.
     */
    @java.lang.Override
    public boolean hasSnapshot() {
      return snapshot_ != null;
    }
    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     * @return The snapshot.
     */
    @java.lang.Override
    public BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
      return snapshot_ == null ? BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
    }
    /**
     * <code>.BargainSnapshot snapshot = 13;</code>
     */
    @java.lang.Override
    public BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
      return getSnapshot();
    }

    public static final int BARGAINID_FIELD_NUMBER = 8;
    private int bargainId_;
    /**
     * <code>uint32 bargainId = 8;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
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
      if (bargainId_ != 0) {
        output.writeUInt32(8, bargainId_);
      }
      if (snapshot_ != null) {
        output.writeMessage(13, getSnapshot());
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, bargainId_);
      }
      if (snapshot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getSnapshot());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof GetBargainDataRspOuterClass.GetBargainDataRsp)) {
        return super.equals(obj);
      }
      GetBargainDataRspOuterClass.GetBargainDataRsp other = (GetBargainDataRspOuterClass.GetBargainDataRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasSnapshot() != other.hasSnapshot()) return false;
      if (hasSnapshot()) {
        if (!getSnapshot()
            .equals(other.getSnapshot())) return false;
      }
      if (getBargainId()
          != other.getBargainId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasSnapshot()) {
        hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
        hash = (53 * hash) + getSnapshot().hashCode();
      }
      hash = (37 * hash) + BARGAINID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetBargainDataRspOuterClass.GetBargainDataRsp parseFrom(
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
    public static Builder newBuilder(GetBargainDataRspOuterClass.GetBargainDataRsp prototype) {
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
     * Protobuf type {@code GetBargainDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetBargainDataRsp)
        GetBargainDataRspOuterClass.GetBargainDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GetBargainDataRspOuterClass.GetBargainDataRsp.class, GetBargainDataRspOuterClass.GetBargainDataRsp.Builder.class);
      }

      // Construct using GetBargainDataRspOuterClass.GetBargainDataRsp.newBuilder()
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
        retcode_ = 0;

        if (snapshotBuilder_ == null) {
          snapshot_ = null;
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }
        bargainId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetBargainDataRspOuterClass.internal_static_GetBargainDataRsp_descriptor;
      }

      @java.lang.Override
      public GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstanceForType() {
        return GetBargainDataRspOuterClass.GetBargainDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public GetBargainDataRspOuterClass.GetBargainDataRsp build() {
        GetBargainDataRspOuterClass.GetBargainDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GetBargainDataRspOuterClass.GetBargainDataRsp buildPartial() {
        GetBargainDataRspOuterClass.GetBargainDataRsp result = new GetBargainDataRspOuterClass.GetBargainDataRsp(this);
        result.retcode_ = retcode_;
        if (snapshotBuilder_ == null) {
          result.snapshot_ = snapshot_;
        } else {
          result.snapshot_ = snapshotBuilder_.build();
        }
        result.bargainId_ = bargainId_;
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
        if (other instanceof GetBargainDataRspOuterClass.GetBargainDataRsp) {
          return mergeFrom((GetBargainDataRspOuterClass.GetBargainDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GetBargainDataRspOuterClass.GetBargainDataRsp other) {
        if (other == GetBargainDataRspOuterClass.GetBargainDataRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasSnapshot()) {
          mergeSnapshot(other.getSnapshot());
        }
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
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
        GetBargainDataRspOuterClass.GetBargainDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GetBargainDataRspOuterClass.GetBargainDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private BargainSnapshotOuterClass.BargainSnapshot snapshot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          BargainSnapshotOuterClass.BargainSnapshot, BargainSnapshotOuterClass.BargainSnapshot.Builder, BargainSnapshotOuterClass.BargainSnapshotOrBuilder> snapshotBuilder_;
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       * @return Whether the snapshot field is set.
       */
      public boolean hasSnapshot() {
        return snapshotBuilder_ != null || snapshot_ != null;
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       * @return The snapshot.
       */
      public BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
        if (snapshotBuilder_ == null) {
          return snapshot_ == null ? BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        } else {
          return snapshotBuilder_.getMessage();
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public Builder setSnapshot(BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          snapshot_ = value;
          onChanged();
        } else {
          snapshotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public Builder setSnapshot(
          BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotBuilder_ == null) {
          snapshot_ = builderForValue.build();
          onChanged();
        } else {
          snapshotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public Builder mergeSnapshot(BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (snapshot_ != null) {
            snapshot_ =
              BargainSnapshotOuterClass.BargainSnapshot.newBuilder(snapshot_).mergeFrom(value).buildPartial();
          } else {
            snapshot_ = value;
          }
          onChanged();
        } else {
          snapshotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public Builder clearSnapshot() {
        if (snapshotBuilder_ == null) {
          snapshot_ = null;
          onChanged();
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public BargainSnapshotOuterClass.BargainSnapshot.Builder getSnapshotBuilder() {
        
        onChanged();
        return getSnapshotFieldBuilder().getBuilder();
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      public BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
        if (snapshotBuilder_ != null) {
          return snapshotBuilder_.getMessageOrBuilder();
        } else {
          return snapshot_ == null ?
              BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          BargainSnapshotOuterClass.BargainSnapshot, BargainSnapshotOuterClass.BargainSnapshot.Builder, BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
          getSnapshotFieldBuilder() {
        if (snapshotBuilder_ == null) {
          snapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              BargainSnapshotOuterClass.BargainSnapshot, BargainSnapshotOuterClass.BargainSnapshot.Builder, BargainSnapshotOuterClass.BargainSnapshotOrBuilder>(
                  getSnapshot(),
                  getParentForChildren(),
                  isClean());
          snapshot_ = null;
        }
        return snapshotBuilder_;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargainId = 8;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargainId = 8;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargainId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetBargainDataRsp)
    }

    // @@protoc_insertion_point(class_scope:GetBargainDataRsp)
    private static final GetBargainDataRspOuterClass.GetBargainDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GetBargainDataRspOuterClass.GetBargainDataRsp();
    }

    public static GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBargainDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetBargainDataRsp>() {
      @java.lang.Override
      public GetBargainDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBargainDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetBargainDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBargainDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GetBargainDataRspOuterClass.GetBargainDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBargainDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBargainDataRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetBargainDataRsp.proto\032\025BargainSnapsh" +
      "ot.proto\"\254\001\n\021GetBargainDataRsp\022\017\n\007retcod" +
      "e\030\016 \001(\005\022\"\n\010snapshot\030\r \001(\0132\020.BargainSnaps" +
      "hot\022\021\n\tbargainId\030\010 \001(\r\"O\n\013PDPLCGAFFNN\022\010\n" +
      "\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\331\003\022\017\n\013DCDNILFDFLB" +
      "\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          BargainSnapshotOuterClass.getDescriptor(),
        });
    internal_static_GetBargainDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetBargainDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBargainDataRsp_descriptor,
        new java.lang.String[] { "Retcode", "Snapshot", "BargainId", });
    BargainSnapshotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
