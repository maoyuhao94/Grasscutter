// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReserveRogueDiaryAvatarReq.proto

public final class ReserveRogueDiaryAvatarReqOuterClass {
  private ReserveRogueDiaryAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReserveRogueDiaryAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReserveRogueDiaryAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar> 
        getReserveAvatarListList();
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReserveAvatarList(int index);
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    int getReserveAvatarListCount();
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    java.util.List<? extends RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
        getReserveAvatarListOrBuilderList();
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReserveAvatarListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ReserveRogueDiaryAvatarReq}
   */
  public static final class ReserveRogueDiaryAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReserveRogueDiaryAvatarReq)
      ReserveRogueDiaryAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReserveRogueDiaryAvatarReq.newBuilder() to construct.
    private ReserveRogueDiaryAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReserveRogueDiaryAvatarReq() {
      reserveAvatarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReserveRogueDiaryAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReserveRogueDiaryAvatarReq(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                reserveAvatarList_ = new java.util.ArrayList<RogueDiaryAvatarOuterClass.RogueDiaryAvatar>();
                mutable_bitField0_ |= 0x00000001;
              }
              reserveAvatarList_.add(
                  input.readMessage(RogueDiaryAvatarOuterClass.RogueDiaryAvatar.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          reserveAvatarList_ = java.util.Collections.unmodifiableList(reserveAvatarList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReserveRogueDiaryAvatarReqOuterClass.internal_static_ReserveRogueDiaryAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReserveRogueDiaryAvatarReqOuterClass.internal_static_ReserveRogueDiaryAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.class, ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ReserveRogueDiaryAvatarReq.GJMGKLDHJBF}
     */
    public enum GJMGKLDHJBF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8607;</code>
       */
      PEPPOHPHJOJ(1, 8607),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GJMGKLDHJBF DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GJMGKLDHJBF EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8607;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8607;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static GJMGKLDHJBF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GJMGKLDHJBF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8607: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GJMGKLDHJBF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GJMGKLDHJBF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GJMGKLDHJBF>() {
              public GJMGKLDHJBF findValueByNumber(int number) {
                return GJMGKLDHJBF.forNumber(number);
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
        return ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GJMGKLDHJBF[] VALUES = getStaticValuesArray();
      private static GJMGKLDHJBF[] getStaticValuesArray() {
        return new GJMGKLDHJBF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GJMGKLDHJBF valueOf(
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

      private GJMGKLDHJBF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ReserveRogueDiaryAvatarReq.GJMGKLDHJBF)
    }

    public static final int RESERVEAVATARLIST_FIELD_NUMBER = 1;
    private java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar> reserveAvatarList_;
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar> getReserveAvatarListList() {
      return reserveAvatarList_;
    }
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
        getReserveAvatarListOrBuilderList() {
      return reserveAvatarList_;
    }
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    @java.lang.Override
    public int getReserveAvatarListCount() {
      return reserveAvatarList_.size();
    }
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    @java.lang.Override
    public RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReserveAvatarList(int index) {
      return reserveAvatarList_.get(index);
    }
    /**
     * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
     */
    @java.lang.Override
    public RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReserveAvatarListOrBuilder(
        int index) {
      return reserveAvatarList_.get(index);
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
      for (int i = 0; i < reserveAvatarList_.size(); i++) {
        output.writeMessage(1, reserveAvatarList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < reserveAvatarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, reserveAvatarList_.get(i));
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
      if (!(obj instanceof ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq)) {
        return super.equals(obj);
      }
      ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq other = (ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq) obj;

      if (!getReserveAvatarListList()
          .equals(other.getReserveAvatarListList())) return false;
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
      if (getReserveAvatarListCount() > 0) {
        hash = (37 * hash) + RESERVEAVATARLIST_FIELD_NUMBER;
        hash = (53 * hash) + getReserveAvatarListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parseFrom(
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
    public static Builder newBuilder(ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq prototype) {
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
     * Protobuf type {@code ReserveRogueDiaryAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReserveRogueDiaryAvatarReq)
        ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ReserveRogueDiaryAvatarReqOuterClass.internal_static_ReserveRogueDiaryAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ReserveRogueDiaryAvatarReqOuterClass.internal_static_ReserveRogueDiaryAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.class, ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.Builder.class);
      }

      // Construct using ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.newBuilder()
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
          getReserveAvatarListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reserveAvatarListBuilder_ == null) {
          reserveAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          reserveAvatarListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ReserveRogueDiaryAvatarReqOuterClass.internal_static_ReserveRogueDiaryAvatarReq_descriptor;
      }

      @java.lang.Override
      public ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq getDefaultInstanceForType() {
        return ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq build() {
        ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq buildPartial() {
        ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq result = new ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq(this);
        int from_bitField0_ = bitField0_;
        if (reserveAvatarListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            reserveAvatarList_ = java.util.Collections.unmodifiableList(reserveAvatarList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.reserveAvatarList_ = reserveAvatarList_;
        } else {
          result.reserveAvatarList_ = reserveAvatarListBuilder_.build();
        }
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
        if (other instanceof ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq) {
          return mergeFrom((ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq other) {
        if (other == ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq.getDefaultInstance()) return this;
        if (reserveAvatarListBuilder_ == null) {
          if (!other.reserveAvatarList_.isEmpty()) {
            if (reserveAvatarList_.isEmpty()) {
              reserveAvatarList_ = other.reserveAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureReserveAvatarListIsMutable();
              reserveAvatarList_.addAll(other.reserveAvatarList_);
            }
            onChanged();
          }
        } else {
          if (!other.reserveAvatarList_.isEmpty()) {
            if (reserveAvatarListBuilder_.isEmpty()) {
              reserveAvatarListBuilder_.dispose();
              reserveAvatarListBuilder_ = null;
              reserveAvatarList_ = other.reserveAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              reserveAvatarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getReserveAvatarListFieldBuilder() : null;
            } else {
              reserveAvatarListBuilder_.addAllMessages(other.reserveAvatarList_);
            }
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
        ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar> reserveAvatarList_ =
        java.util.Collections.emptyList();
      private void ensureReserveAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          reserveAvatarList_ = new java.util.ArrayList<RogueDiaryAvatarOuterClass.RogueDiaryAvatar>(reserveAvatarList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          RogueDiaryAvatarOuterClass.RogueDiaryAvatar, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> reserveAvatarListBuilder_;

      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar> getReserveAvatarListList() {
        if (reserveAvatarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reserveAvatarList_);
        } else {
          return reserveAvatarListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public int getReserveAvatarListCount() {
        if (reserveAvatarListBuilder_ == null) {
          return reserveAvatarList_.size();
        } else {
          return reserveAvatarListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReserveAvatarList(int index) {
        if (reserveAvatarListBuilder_ == null) {
          return reserveAvatarList_.get(index);
        } else {
          return reserveAvatarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder setReserveAvatarList(
          int index, RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (reserveAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.set(index, value);
          onChanged();
        } else {
          reserveAvatarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder setReserveAvatarList(
          int index, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (reserveAvatarListBuilder_ == null) {
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.set(index, builderForValue.build());
          onChanged();
        } else {
          reserveAvatarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder addReserveAvatarList(RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (reserveAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.add(value);
          onChanged();
        } else {
          reserveAvatarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder addReserveAvatarList(
          int index, RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (reserveAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.add(index, value);
          onChanged();
        } else {
          reserveAvatarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder addReserveAvatarList(
          RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (reserveAvatarListBuilder_ == null) {
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.add(builderForValue.build());
          onChanged();
        } else {
          reserveAvatarListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder addReserveAvatarList(
          int index, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (reserveAvatarListBuilder_ == null) {
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          reserveAvatarListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder addAllReserveAvatarList(
          java.lang.Iterable<? extends RogueDiaryAvatarOuterClass.RogueDiaryAvatar> values) {
        if (reserveAvatarListBuilder_ == null) {
          ensureReserveAvatarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reserveAvatarList_);
          onChanged();
        } else {
          reserveAvatarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder clearReserveAvatarList() {
        if (reserveAvatarListBuilder_ == null) {
          reserveAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          reserveAvatarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public Builder removeReserveAvatarList(int index) {
        if (reserveAvatarListBuilder_ == null) {
          ensureReserveAvatarListIsMutable();
          reserveAvatarList_.remove(index);
          onChanged();
        } else {
          reserveAvatarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder getReserveAvatarListBuilder(
          int index) {
        return getReserveAvatarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReserveAvatarListOrBuilder(
          int index) {
        if (reserveAvatarListBuilder_ == null) {
          return reserveAvatarList_.get(index);  } else {
          return reserveAvatarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public java.util.List<? extends RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
           getReserveAvatarListOrBuilderList() {
        if (reserveAvatarListBuilder_ != null) {
          return reserveAvatarListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reserveAvatarList_);
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder addReserveAvatarListBuilder() {
        return getReserveAvatarListFieldBuilder().addBuilder(
            RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder addReserveAvatarListBuilder(
          int index) {
        return getReserveAvatarListFieldBuilder().addBuilder(
            index, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueDiaryAvatar reserveAvatarList = 1;</code>
       */
      public java.util.List<RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder> 
           getReserveAvatarListBuilderList() {
        return getReserveAvatarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          RogueDiaryAvatarOuterClass.RogueDiaryAvatar, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
          getReserveAvatarListFieldBuilder() {
        if (reserveAvatarListBuilder_ == null) {
          reserveAvatarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              RogueDiaryAvatarOuterClass.RogueDiaryAvatar, RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder>(
                  reserveAvatarList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          reserveAvatarList_ = null;
        }
        return reserveAvatarListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReserveRogueDiaryAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:ReserveRogueDiaryAvatarReq)
    private static final ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq();
    }

    public static ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReserveRogueDiaryAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<ReserveRogueDiaryAvatarReq>() {
      @java.lang.Override
      public ReserveRogueDiaryAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReserveRogueDiaryAvatarReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReserveRogueDiaryAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReserveRogueDiaryAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ReserveRogueDiaryAvatarReqOuterClass.ReserveRogueDiaryAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReserveRogueDiaryAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReserveRogueDiaryAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ReserveRogueDiaryAvatarReq.proto\032\026Rogu" +
      "eDiaryAvatar.proto\"\254\001\n\032ReserveRogueDiary" +
      "AvatarReq\022,\n\021reserveAvatarList\030\001 \003(\0132\021.R" +
      "ogueDiaryAvatar\"`\n\013GJMGKLDHJBF\022\010\n\004NONE\020\000" +
      "\022\020\n\013PEPPOHPHJOJ\020\237C\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013N" +
      "NBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RogueDiaryAvatarOuterClass.getDescriptor(),
        });
    internal_static_ReserveRogueDiaryAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReserveRogueDiaryAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReserveRogueDiaryAvatarReq_descriptor,
        new java.lang.String[] { "ReserveAvatarList", });
    RogueDiaryAvatarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
