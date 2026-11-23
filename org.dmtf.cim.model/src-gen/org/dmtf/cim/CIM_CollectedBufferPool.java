/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Collected Buffer Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CollectedBufferPool is an aggregation association representing that a Pool may itself be contained in a 'higher level' Pool.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectedBufferPool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::Buffers' override.Collection='CIM_BufferPool REF' override.Collection.Aggregate='true' override.Collection.Description='The \'higher level\' or parent Pool.' override.Member='CIM_BufferPool REF' override.Member.Description='The \'collected\' Pool.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_CollectedBufferPool extends CIM_MemberOfCollection {
} // CIM_CollectedBufferPool
