// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ACNFCMOJFAB.proto

public final class ACNFCMOJFABOuterClass {
  private ACNFCMOJFABOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ACNFCMOJFABOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ACNFCMOJFAB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK> 
        getEcpfngapbhcList();
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    BOIPHJCFLBKOuterClass.BOIPHJCFLBK getEcpfngapbhc(int index);
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    int getEcpfngapbhcCount();
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    java.util.List<? extends BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder> 
        getEcpfngapbhcOrBuilderList();
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder getEcpfngapbhcOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ACNFCMOJFAB}
   */
  public static final class ACNFCMOJFAB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ACNFCMOJFAB)
      ACNFCMOJFABOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ACNFCMOJFAB.newBuilder() to construct.
    private ACNFCMOJFAB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ACNFCMOJFAB() {
      ecpfngapbhc_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ACNFCMOJFAB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ACNFCMOJFAB(
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
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ecpfngapbhc_ = new java.util.ArrayList<BOIPHJCFLBKOuterClass.BOIPHJCFLBK>();
                mutable_bitField0_ |= 0x00000001;
              }
              ecpfngapbhc_.add(
                  input.readMessage(BOIPHJCFLBKOuterClass.BOIPHJCFLBK.parser(), extensionRegistry));
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
          ecpfngapbhc_ = java.util.Collections.unmodifiableList(ecpfngapbhc_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ACNFCMOJFABOuterClass.internal_static_ACNFCMOJFAB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ACNFCMOJFABOuterClass.internal_static_ACNFCMOJFAB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ACNFCMOJFABOuterClass.ACNFCMOJFAB.class, ACNFCMOJFABOuterClass.ACNFCMOJFAB.Builder.class);
    }

    public static final int ECPFNGAPBHC_FIELD_NUMBER = 14;
    private java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK> ecpfngapbhc_;
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    @java.lang.Override
    public java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK> getEcpfngapbhcList() {
      return ecpfngapbhc_;
    }
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder> 
        getEcpfngapbhcOrBuilderList() {
      return ecpfngapbhc_;
    }
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    @java.lang.Override
    public int getEcpfngapbhcCount() {
      return ecpfngapbhc_.size();
    }
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    @java.lang.Override
    public BOIPHJCFLBKOuterClass.BOIPHJCFLBK getEcpfngapbhc(int index) {
      return ecpfngapbhc_.get(index);
    }
    /**
     * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
     */
    @java.lang.Override
    public BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder getEcpfngapbhcOrBuilder(
        int index) {
      return ecpfngapbhc_.get(index);
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
      for (int i = 0; i < ecpfngapbhc_.size(); i++) {
        output.writeMessage(14, ecpfngapbhc_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < ecpfngapbhc_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, ecpfngapbhc_.get(i));
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
      if (!(obj instanceof ACNFCMOJFABOuterClass.ACNFCMOJFAB)) {
        return super.equals(obj);
      }
      ACNFCMOJFABOuterClass.ACNFCMOJFAB other = (ACNFCMOJFABOuterClass.ACNFCMOJFAB) obj;

      if (!getEcpfngapbhcList()
          .equals(other.getEcpfngapbhcList())) return false;
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
      if (getEcpfngapbhcCount() > 0) {
        hash = (37 * hash) + ECPFNGAPBHC_FIELD_NUMBER;
        hash = (53 * hash) + getEcpfngapbhcList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB parseFrom(
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
    public static Builder newBuilder(ACNFCMOJFABOuterClass.ACNFCMOJFAB prototype) {
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
     * Protobuf type {@code ACNFCMOJFAB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ACNFCMOJFAB)
        ACNFCMOJFABOuterClass.ACNFCMOJFABOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ACNFCMOJFABOuterClass.internal_static_ACNFCMOJFAB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ACNFCMOJFABOuterClass.internal_static_ACNFCMOJFAB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ACNFCMOJFABOuterClass.ACNFCMOJFAB.class, ACNFCMOJFABOuterClass.ACNFCMOJFAB.Builder.class);
      }

      // Construct using ACNFCMOJFABOuterClass.ACNFCMOJFAB.newBuilder()
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
          getEcpfngapbhcFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (ecpfngapbhcBuilder_ == null) {
          ecpfngapbhc_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ecpfngapbhcBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ACNFCMOJFABOuterClass.internal_static_ACNFCMOJFAB_descriptor;
      }

      @java.lang.Override
      public ACNFCMOJFABOuterClass.ACNFCMOJFAB getDefaultInstanceForType() {
        return ACNFCMOJFABOuterClass.ACNFCMOJFAB.getDefaultInstance();
      }

      @java.lang.Override
      public ACNFCMOJFABOuterClass.ACNFCMOJFAB build() {
        ACNFCMOJFABOuterClass.ACNFCMOJFAB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ACNFCMOJFABOuterClass.ACNFCMOJFAB buildPartial() {
        ACNFCMOJFABOuterClass.ACNFCMOJFAB result = new ACNFCMOJFABOuterClass.ACNFCMOJFAB(this);
        int from_bitField0_ = bitField0_;
        if (ecpfngapbhcBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            ecpfngapbhc_ = java.util.Collections.unmodifiableList(ecpfngapbhc_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ecpfngapbhc_ = ecpfngapbhc_;
        } else {
          result.ecpfngapbhc_ = ecpfngapbhcBuilder_.build();
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
        if (other instanceof ACNFCMOJFABOuterClass.ACNFCMOJFAB) {
          return mergeFrom((ACNFCMOJFABOuterClass.ACNFCMOJFAB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ACNFCMOJFABOuterClass.ACNFCMOJFAB other) {
        if (other == ACNFCMOJFABOuterClass.ACNFCMOJFAB.getDefaultInstance()) return this;
        if (ecpfngapbhcBuilder_ == null) {
          if (!other.ecpfngapbhc_.isEmpty()) {
            if (ecpfngapbhc_.isEmpty()) {
              ecpfngapbhc_ = other.ecpfngapbhc_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEcpfngapbhcIsMutable();
              ecpfngapbhc_.addAll(other.ecpfngapbhc_);
            }
            onChanged();
          }
        } else {
          if (!other.ecpfngapbhc_.isEmpty()) {
            if (ecpfngapbhcBuilder_.isEmpty()) {
              ecpfngapbhcBuilder_.dispose();
              ecpfngapbhcBuilder_ = null;
              ecpfngapbhc_ = other.ecpfngapbhc_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ecpfngapbhcBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEcpfngapbhcFieldBuilder() : null;
            } else {
              ecpfngapbhcBuilder_.addAllMessages(other.ecpfngapbhc_);
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
        ACNFCMOJFABOuterClass.ACNFCMOJFAB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ACNFCMOJFABOuterClass.ACNFCMOJFAB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK> ecpfngapbhc_ =
        java.util.Collections.emptyList();
      private void ensureEcpfngapbhcIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ecpfngapbhc_ = new java.util.ArrayList<BOIPHJCFLBKOuterClass.BOIPHJCFLBK>(ecpfngapbhc_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          BOIPHJCFLBKOuterClass.BOIPHJCFLBK, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder, BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder> ecpfngapbhcBuilder_;

      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK> getEcpfngapbhcList() {
        if (ecpfngapbhcBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ecpfngapbhc_);
        } else {
          return ecpfngapbhcBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public int getEcpfngapbhcCount() {
        if (ecpfngapbhcBuilder_ == null) {
          return ecpfngapbhc_.size();
        } else {
          return ecpfngapbhcBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public BOIPHJCFLBKOuterClass.BOIPHJCFLBK getEcpfngapbhc(int index) {
        if (ecpfngapbhcBuilder_ == null) {
          return ecpfngapbhc_.get(index);
        } else {
          return ecpfngapbhcBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder setEcpfngapbhc(
          int index, BOIPHJCFLBKOuterClass.BOIPHJCFLBK value) {
        if (ecpfngapbhcBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.set(index, value);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder setEcpfngapbhc(
          int index, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder builderForValue) {
        if (ecpfngapbhcBuilder_ == null) {
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.set(index, builderForValue.build());
          onChanged();
        } else {
          ecpfngapbhcBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder addEcpfngapbhc(BOIPHJCFLBKOuterClass.BOIPHJCFLBK value) {
        if (ecpfngapbhcBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.add(value);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder addEcpfngapbhc(
          int index, BOIPHJCFLBKOuterClass.BOIPHJCFLBK value) {
        if (ecpfngapbhcBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.add(index, value);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder addEcpfngapbhc(
          BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder builderForValue) {
        if (ecpfngapbhcBuilder_ == null) {
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.add(builderForValue.build());
          onChanged();
        } else {
          ecpfngapbhcBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder addEcpfngapbhc(
          int index, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder builderForValue) {
        if (ecpfngapbhcBuilder_ == null) {
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.add(index, builderForValue.build());
          onChanged();
        } else {
          ecpfngapbhcBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder addAllEcpfngapbhc(
          java.lang.Iterable<? extends BOIPHJCFLBKOuterClass.BOIPHJCFLBK> values) {
        if (ecpfngapbhcBuilder_ == null) {
          ensureEcpfngapbhcIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, ecpfngapbhc_);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder clearEcpfngapbhc() {
        if (ecpfngapbhcBuilder_ == null) {
          ecpfngapbhc_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public Builder removeEcpfngapbhc(int index) {
        if (ecpfngapbhcBuilder_ == null) {
          ensureEcpfngapbhcIsMutable();
          ecpfngapbhc_.remove(index);
          onChanged();
        } else {
          ecpfngapbhcBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder getEcpfngapbhcBuilder(
          int index) {
        return getEcpfngapbhcFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder getEcpfngapbhcOrBuilder(
          int index) {
        if (ecpfngapbhcBuilder_ == null) {
          return ecpfngapbhc_.get(index);  } else {
          return ecpfngapbhcBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public java.util.List<? extends BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder> 
           getEcpfngapbhcOrBuilderList() {
        if (ecpfngapbhcBuilder_ != null) {
          return ecpfngapbhcBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ecpfngapbhc_);
        }
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder addEcpfngapbhcBuilder() {
        return getEcpfngapbhcFieldBuilder().addBuilder(
            BOIPHJCFLBKOuterClass.BOIPHJCFLBK.getDefaultInstance());
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder addEcpfngapbhcBuilder(
          int index) {
        return getEcpfngapbhcFieldBuilder().addBuilder(
            index, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.getDefaultInstance());
      }
      /**
       * <code>repeated .BOIPHJCFLBK ecpfngapbhc = 14;</code>
       */
      public java.util.List<BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder> 
           getEcpfngapbhcBuilderList() {
        return getEcpfngapbhcFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          BOIPHJCFLBKOuterClass.BOIPHJCFLBK, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder, BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder> 
          getEcpfngapbhcFieldBuilder() {
        if (ecpfngapbhcBuilder_ == null) {
          ecpfngapbhcBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              BOIPHJCFLBKOuterClass.BOIPHJCFLBK, BOIPHJCFLBKOuterClass.BOIPHJCFLBK.Builder, BOIPHJCFLBKOuterClass.BOIPHJCFLBKOrBuilder>(
                  ecpfngapbhc_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          ecpfngapbhc_ = null;
        }
        return ecpfngapbhcBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ACNFCMOJFAB)
    }

    // @@protoc_insertion_point(class_scope:ACNFCMOJFAB)
    private static final ACNFCMOJFABOuterClass.ACNFCMOJFAB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ACNFCMOJFABOuterClass.ACNFCMOJFAB();
    }

    public static ACNFCMOJFABOuterClass.ACNFCMOJFAB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ACNFCMOJFAB>
        PARSER = new com.google.protobuf.AbstractParser<ACNFCMOJFAB>() {
      @java.lang.Override
      public ACNFCMOJFAB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ACNFCMOJFAB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ACNFCMOJFAB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ACNFCMOJFAB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ACNFCMOJFABOuterClass.ACNFCMOJFAB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ACNFCMOJFAB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ACNFCMOJFAB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ACNFCMOJFAB.proto\032\021BOIPHJCFLBK.proto\"0" +
      "\n\013ACNFCMOJFAB\022!\n\013ecpfngapbhc\030\016 \003(\0132\014.BOI" +
      "PHJCFLBKb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          BOIPHJCFLBKOuterClass.getDescriptor(),
        });
    internal_static_ACNFCMOJFAB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ACNFCMOJFAB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ACNFCMOJFAB_descriptor,
        new java.lang.String[] { "Ecpfngapbhc", });
    BOIPHJCFLBKOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
