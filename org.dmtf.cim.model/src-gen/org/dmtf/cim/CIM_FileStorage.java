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
 * A representation of the model object '<em><b>CIM File Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between the FileSystem and the LogicalFile(s) addressed through this FileSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::FileElements' override.GroupComponent='CIM_FileSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The FileSystem.' override.PartComponent='CIM_LogicalFile REF' override.PartComponent.Weak='true' override.PartComponent.Description='The LogicalFile stored in the context of the FileSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_FileStorage extends CIM_Component {
} // CIM_FileStorage
