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
 * A representation of the model object '<em><b>CIM Database File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DatabaseFile captures the relationship between a database and the supporting files that make up the database as well as the purpose served by the files within the context of the database.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Database::Storage' override.GroupComponent='CIM_CommonDatabase REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The single CommonDatabase instance that uses the referenced LogicalFile.' override.PartComponent='CIM_LogicalFile REF' override.PartComponent.Description='One of any number of LogicalFile instances that are utilized by the referenced CommonDatabase.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseFile extends CIM_Component {
} // CIM_DatabaseFile
