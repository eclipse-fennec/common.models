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
 * A representation of the model object '<em><b>CIM Resides On Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a LogicalElement and the StorageExtent where it is located. Typically, a FileSystem ResidesOn a LogicalDisk. However, it is possible for a logical file or other internal data store to reside directly on a StorageExtent or appropriate subclass.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResidesOnExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::System::FileElements' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Description='The StorageExtent.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Description='The LogicalElement that is located on the StorageExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ResidesOnExtent extends CIM_Dependency {
} // CIM_ResidesOnExtent
