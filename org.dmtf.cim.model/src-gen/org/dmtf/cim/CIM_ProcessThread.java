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
 * A representation of the model object '<em><b>CIM Process Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between a Process and the Thread(s) running in the context of this Process.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessThread()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::Processing' override.GroupComponent='CIM_Process REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The Process.' override.PartComponent='CIM_Thread REF' override.PartComponent.Weak='true' override.PartComponent.Description='The Thread running in the context of the Process.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessThread extends CIM_Component {
} // CIM_ProcessThread
